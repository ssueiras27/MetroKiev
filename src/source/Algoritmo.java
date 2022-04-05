package source;

import java.util.ArrayList;

import es.upm.aedlib.graph.Edge;
import es.upm.aedlib.graph.UndirectedAdjacencyListGraph;
import es.upm.aedlib.graph.Vertex;

public class Algoritmo {

    private ArrayList<Vertex<Estacion>> listaAbierta;
    private ArrayList<Vertex<Estacion>> listaCerrada;
    private ArrayList<Estacion> camino;
    private Vertex<Estacion> origen;
    private Vertex<Estacion> destino;
    private UndirectedAdjacencyListGraph<Estacion, Integer> metro;

    public Algoritmo(Vertex<Estacion> origen, Vertex<Estacion> destino,
            UndirectedAdjacencyListGraph<Estacion, Integer> metro) {
        this.origen = origen;
        this.destino = destino;
        listaAbierta = new ArrayList<Vertex<Estacion>>();
        listaCerrada = new ArrayList<Vertex<Estacion>>();
        camino = new ArrayList<Estacion>();
        this.metro = metro;
        origen.element().setG(0);
    }

    private Vertex<Estacion> nodoMenorDistanciaTotal(ArrayList<Vertex<Estacion>> lista) {
        Vertex<Estacion> resultado = null;
        if (!lista.isEmpty()) {
            resultado = lista.get(0);
            for (int i = 1; i < lista.size(); i++){
                if (lista.get(i).element().getF() < resultado.element().getF()){
                    resultado = lista.get(i);
                }
            }   
        }
        return resultado;
    }

    private double haversine(double lat1, double lon1, double lat2, double lon2) {
        // distance between latitudes and longitudes
        double dLat = Math.toRadians(lat2 - lat1);
        double dLon = Math.toRadians(lon2 - lon1);

        // convert to radians
        lat1 = Math.toRadians(lat1);
        lat2 = Math.toRadians(lat2);

        // apply formulae
        double a = Math.pow(Math.sin(dLat / 2), 2) +
                Math.pow(Math.sin(dLon / 2), 2) *
                        Math.cos(lat1) *
                        Math.cos(lat2);
        double rad = 6371;
        double c = 2 * Math.asin(Math.sqrt(a));
        return rad * c;
    }

    private double calcH(Vertex<Estacion> station) {

        Estacion Estacion1 = station.element();
        Estacion Estacion2 = destino.element();

        double longitud1 = Estacion1.getLon();
        double longitud2 = Estacion2.getLon();
        double latitud1 = Estacion1.getLat();
        double latitud2 = Estacion2.getLat();
        return haversine(latitud1, longitud1, latitud2, longitud2);
    }

    public ArrayList<Estacion> calcSol() {
        Vertex<Estacion> actual = null;
        Vertex<Estacion> estacion2 = null;
        listaAbierta.add(origen);
        while (!listaAbierta.isEmpty()) {
            actual = nodoMenorDistanciaTotal(listaAbierta);
            listaCerrada.add(actual);
            listaAbierta.remove(actual);
            if (actual.element().getNum() == destino.element().getNum()) {
                listaAbierta = new ArrayList<>();
            } else {
                for(Edge <Integer> arista: metro.edges(actual)){
                     estacion2 = metro.opposite(actual, arista);
                     Estacion estacion1 = estacion2.element();
                     double g = arista.element() + actual.element().getG();
                     if (!listaAbierta.contains(estacion2) && !listaCerrada.contains(estacion2)) {
                        estacion1.setG(g);
                        estacion1.setH(calcH(estacion2));
                        estacion1.setF(estacion1.getG() + estacion1.getH());
                        estacion1.setPadre(actual);
                        estacion1.setDistancia(arista.element());
                        listaAbierta.add(estacion2);
                    } else if (listaAbierta.contains(estacion2)) {
                        if (g < listaAbierta.get(listaAbierta.indexOf(estacion2)).element().getG()) {
                            estacion1.setG(g);
                            estacion1.setH(calcH(estacion2));
                            estacion1.setF(estacion1.getG() + estacion1.getH());
                            estacion1.setPadre(actual);
                            estacion1.setDistancia(arista.element());
                        }
                    }
                }
            }
        }
        camino.add(0,actual.element());
        recorrerPath(actual);
        return camino;
    }

    private void recorrerPath (Vertex<Estacion> fin){
        if (fin.element().getNum() != origen.element().getNum()){
            camino.add(0,fin.element().getPadre().element());
            recorrerPath(fin.element().getPadre());
        }
    }
}
