package source;

import java.util.HashSet;
import java.util.Set;

import es.upm.aedlib.graph.UndirectedAdjacencyListGraph;
import es.upm.aedlib.graph.Vertex;

public class Metro {

	// GrafoMetro
	private UndirectedAdjacencyListGraph<Estacion, Integer> metro = new UndirectedAdjacencyListGraph<Estacion, Integer>();

	// Linea 1
	private HashSet<Estacion> linea1 = new HashSet<Estacion>();
	private Estacion akademmistechko = new Estacion(110, 50.46675475892056, 30.381006405069076, "Akademmistechko", 33, 380);
	private Estacion zhytomyrska = new Estacion(111, 50.45585613323126, 30.3649678823372, "Zhytomyrska", 81, 380);
	private Estacion sviatoshyn = new Estacion(112, 50.457790572183214, 30.392144268843225, "Sviatoshyn", 128 , 380);
	private Estacion nyvky = new Estacion(113, 50.45585613323126, 30.3649678823372, "Nyvky", 175, 380);
	private Estacion beresteiska = new Estacion(114, 50.45839813948897, 30.42016908418479, "Beresteiska", 220, 380);
	private Estacion shuliavska = new Estacion(115, 50.4516456186586, 30.46672635350167, "Shuliavska", 269, 380);
	private Estacion politekhnichny_instytut = new Estacion(116, 50.45585613323126, 30.3649678823372,
			"Politekhnichny_Instytut", 318, 380);
	private Estacion vokzalna = new Estacion(117, 50.44147876914492, 30.48998445534869, "Vokzalna", 379, 380);
	private Estacion universytet = new Estacion(118, 50.44454451915474, 30.506663611172094, "Universytet", 426, 380);
	//Coordenadas estacion intermedia son 477, 380
	private Estacion teatralna = new Estacion(119, 50.44518045792267, 30.518989168842854, "Teatralna", 505, 353);
	//Coordenadas estacion intermedia son 533, 326
	private Estacion khreshchatyk = new Estacion(120, 50.4473806112625, 30.5216692535015, "Khreshchatyk", 589, 326);
	private Estacion arsenalna = new Estacion(121, 50.44294636055214, 30.544728553501262, "Arsenalna", 674, 326);
	private Estacion dnipro = new Estacion(122, 50.441554134599954, 30.55948199767794, "Dnipro", 741, 326);
	private Estacion hidropark = new Estacion(123, 50.446100958583344, 30.576905455348957, "Hidropark", 787, 278);
	private Estacion livoberezhna = new Estacion(124, 50.45205525637563, 30.598124911172356, "Livoberezhna", 816, 249);
	private Estacion darnytsia = new Estacion(125, 50.45366903891538, 30.61087513816032, "Darnytsia", 845, 222);
	private Estacion chernihivska = new Estacion(126, 50.4591086944747, 30.630641226514072, "Chernihivska", 883, 184);
	private Estacion lisova = new Estacion(127, 50.46362037995545, 30.6451901688435, "Lisova", 929, 136);

	// Linea 2
	private HashSet<Estacion> linea2 = new HashSet<Estacion>();
	private Estacion heroiv_dnipra = new Estacion(210, 50.52160003845985, 30.49931453995005, "Heroiv_Dnipra", 589, 22);
	private Estacion minska = new Estacion(211, 50.5142123847156, 30.49916202180615, "Minska", 589, 62);
	private Estacion obolon = new Estacion(212, 50.50170681904432, 30.496070151465382, "Obolon", 589, 98);
	private Estacion petrivka = new Estacion(213, 50.486079108356364, 30.49784790514234, "Petrivka", 589, 137);
	private Estacion tarasa_shevchenka = new Estacion(214, 50.4733663989516, 30.505134571874923, "Tarasa_Shevchenka", 589, 184);
	private Estacion kontraktova_ploshcha = new Estacion(215, 50.464915369625125, 30.51639763906534,
			"Kontraktova_Ploshcha", 589, 221);
	private Estacion poshtova_ploshcha = new Estacion(216, 50.45951707282872, 30.523912729960614, "Poshtova_Ploshcha", 589, 258);
	private Estacion maidan_nezalezhnosti = new Estacion(217, 50.448121689513535, 30.52500349397784,
			"Maidan_Nezalezhnosti", 589, 306);
	private Estacion ploshcha_lva_tolstogo = new Estacion(218, 50.440188959481496, 30.518379511242905,
			"Ploshcha_Lva_Tolstogo", 589, 381);
	private Estacion olimpiiska_station = new Estacion(219, 50.432222903276205, 30.516151849917684,
			"Olimpiiska_Station", 589, 455);
	private Estacion palats_ukraina = new Estacion(220, 50.4214125990715, 30.520763055871125, "Palats_Ukraina", 589, 504);
	private Estacion lybidska = new Estacion(221, 50.41398115059668, 30.52488408470507, "Lybidska", 589, 570);
	private Estacion demiivska = new Estacion(222, 50.40478658858161, 30.516867459993904, "Demiivska", 589, 626);
	private Estacion holosiivska = new Estacion(223, 50.397382949617196, 30.508249729875033, "Holosiivska", 553, 665);
	private Estacion vasylkivska = new Estacion(224, 50.39332996995807, 30.48819388491753, "Vasylkivska", 466, 665);
	private Estacion vystavkovyi_tsentr = new Estacion(225, 50.38243402600231, 30.477578908355618,
			"Vystavkovyi_Tsentr", 400, 665);
	private Estacion ipodrom = new Estacion(226, 50.376574184279164, 30.468844730083603, "Ipodrom", 345, 665);
	private Estacion teremky = new Estacion(227, 50.367110745432015, 30.454140348354382, "Teremky", 279, 665);

	// Linea 3
	private HashSet<Estacion> linea3 = new HashSet<Estacion>();
	private Estacion syrets = new Estacion(310, 50.47727066856833, 30.432343313844264, "Syrets", 288, 136);
	private Estacion dorohozhychi = new Estacion(311, 50.47394306957003, 30.449166184443364, "Dorohozhychi", 326, 173);
	private Estacion lukianivska = new Estacion(312, 50.464095426259846, 30.48406129577513, "Lukianivska", 363, 211);
	private Estacion zoloti_vorota = new Estacion(314, 50.44650197103963, 30.51536071712459, "Zoloti_Vorota", 495, 345);
	//Estacion intermedia con 535, 382
	private Estacion palats_sportu = new Estacion(315, 50.44033448310042, 30.519225431663294, "Palats_Sportu", 609, 382);
	//Estacion intermedia con 645, 382
	private Estacion klovska = new Estacion(316, 50.43707953369669, 30.531874043244425, "Klovska", 665, 400);
	private Estacion pecherska = new Estacion(317, 50.427736412230395, 30.539503811949306, "Pecherska", 683, 421);
	private Estacion druzhby_narodiv = new Estacion(318, 50.417296981224695, 30.547765583555393, "Druzhby_Narodiv", 712, 446);
	private Estacion vydubychi = new Estacion(319, 50.401980853530816, 30.560391846522094, "Vydubychi", 739, 474);
	private Estacion slavutych = new Estacion(321, 50.39458880879355, 30.604924041922324, "Slavutych", 788, 522);
	private Estacion osokorky = new Estacion(322, 50.39544768267406, 30.61632063988623, "Osokorky", 806, 543);
	private Estacion pozniaky = new Estacion(323, 50.39789326515431, 30.634714149982393, "Pozniaky", 835, 570);
	private Estacion kharkivska = new Estacion(324, 50.400694912464616, 30.652074083010103, "Kharkivska", 863, 599);
	private Estacion vyrlytsia = new Estacion(325, 50.40313038087369, 30.666827818130912, "Vyrlytsia", 890, 626);
	private Estacion boryspilska = new Estacion(326, 50.403411929826284, 30.684496961280765, "Boryspilska", 918, 654);
	private Estacion hervonyi_khutir = new Estacion(327, 50.40946482815093, 30.696202769225216, "Hervonyi_Khutir", 948, 682);

	public Metro() {

		// Linea 1
		Vertex<Estacion> Akademmistechko1 = metro.insertVertex(akademmistechko);
		Vertex<Estacion> Zhytomyrska1 = metro.insertVertex(zhytomyrska);
		Vertex<Estacion> Sviatoshyn1 = metro.insertVertex(sviatoshyn);
		Vertex<Estacion> Nyvky1 = metro.insertVertex(nyvky);
		Vertex<Estacion> Beresteiska1 = metro.insertVertex(beresteiska);
		Vertex<Estacion> Shuliavska1 = metro.insertVertex(shuliavska);
		Vertex<Estacion> Politekhnichny_Instytut1 = metro.insertVertex(politekhnichny_instytut);
		Vertex<Estacion> Vokzalna1 = metro.insertVertex(vokzalna);
		Vertex<Estacion> Universytet1 = metro.insertVertex(universytet);
		Vertex<Estacion> Teatralna1 = metro.insertVertex(teatralna);
		Vertex<Estacion> Khreshchatyk1 = metro.insertVertex(khreshchatyk);
		Vertex<Estacion> Arsenalna1 = metro.insertVertex(arsenalna);
		Vertex<Estacion> Dnipro1 = metro.insertVertex(dnipro);
		Vertex<Estacion> Hidropark1 = metro.insertVertex(hidropark);
		Vertex<Estacion> Livoberezhna1 = metro.insertVertex(livoberezhna);
		Vertex<Estacion> Darnytsia1 = metro.insertVertex(darnytsia);
		Vertex<Estacion> Chernihivska1 = metro.insertVertex(chernihivska);
		Vertex<Estacion> Lisova1 = metro.insertVertex(lisova);

		metro.insertUndirectedEdge(Akademmistechko1, Zhytomyrska1, 1200);
		metro.insertUndirectedEdge(Zhytomyrska1, Sviatoshyn1, 1800);
		metro.insertUndirectedEdge(Sviatoshyn1, Nyvky1, 1000);
		metro.insertUndirectedEdge(Nyvky1, Beresteiska1, 1200);
		metro.insertUndirectedEdge(Beresteiska1, Shuliavska1, 1800);
		metro.insertUndirectedEdge(Shuliavska1, Politekhnichny_Instytut1, 1500);
		metro.insertUndirectedEdge(Politekhnichny_Instytut1, Vokzalna1, 1800);
		metro.insertUndirectedEdge(Vokzalna1, Universytet1, 1300);
		metro.insertUndirectedEdge(Universytet1, Teatralna1, 900);
		metro.insertUndirectedEdge(Teatralna1, Khreshchatyk1, 600);
		metro.insertUndirectedEdge(Khreshchatyk1, Arsenalna1, 1400);
		metro.insertUndirectedEdge(Arsenalna1, Dnipro1, 1000);
		metro.insertUndirectedEdge(Dnipro1, Hidropark1, 1400);
		metro.insertUndirectedEdge(Hidropark1, Livoberezhna1, 1600);
		metro.insertUndirectedEdge(Livoberezhna1, Darnytsia1, 1200);
		metro.insertUndirectedEdge(Darnytsia1, Chernihivska1, 1300);
		metro.insertUndirectedEdge(Chernihivska1, Lisova1, 1100);

		linea1.add(akademmistechko);
		linea1.add(zhytomyrska);
		linea1.add(sviatoshyn);
		linea1.add(nyvky);
		linea1.add(beresteiska);
		linea1.add(shuliavska);
		linea1.add(politekhnichny_instytut);
		linea1.add(vokzalna);
		linea1.add(universytet);
		linea1.add(teatralna);
		linea1.add(khreshchatyk);
		linea1.add(arsenalna);
		linea1.add(dnipro);
		linea1.add(hidropark);
		linea1.add(livoberezhna);
		linea1.add(darnytsia);
		linea1.add(chernihivska);
		linea1.add(lisova);

		// Linea 2
		Vertex<Estacion> heroiv_dnipra2 = metro.insertVertex(heroiv_dnipra);
		Vertex<Estacion> minska2 = metro.insertVertex(minska);
		Vertex<Estacion> obolon2 = metro.insertVertex(obolon);
		Vertex<Estacion> petrivka2 = metro.insertVertex(petrivka);
		Vertex<Estacion> tarasa_shevchenka2 = metro.insertVertex(tarasa_shevchenka);
		Vertex<Estacion> kontraktova_ploshcha2 = metro.insertVertex(kontraktova_ploshcha);
		Vertex<Estacion> poshtova_ploshcha2 = metro.insertVertex(poshtova_ploshcha);
		Vertex<Estacion> maidan_nezalezhnosti2 = metro.insertVertex(maidan_nezalezhnosti);
		Vertex<Estacion> ploshcha_lva_tolstogo2 = metro.insertVertex(ploshcha_lva_tolstogo);
		Vertex<Estacion> olimpiiska_station2 = metro.insertVertex(olimpiiska_station);
		Vertex<Estacion> palats_ukraina2 = metro.insertVertex(palats_ukraina);
		Vertex<Estacion> lybidska2 = metro.insertVertex(lybidska);
		Vertex<Estacion> demiivska2 = metro.insertVertex(demiivska);
		Vertex<Estacion> holosiivska2 = metro.insertVertex(holosiivska);
		Vertex<Estacion> vasylkivska2 = metro.insertVertex(vasylkivska);
		Vertex<Estacion> vystavkovyi_tsentr2 = metro.insertVertex(vystavkovyi_tsentr);
		Vertex<Estacion> ipodrom2 = metro.insertVertex(ipodrom);
		Vertex<Estacion> teremky2 = metro.insertVertex(teremky);

		metro.insertUndirectedEdge(heroiv_dnipra2, minska2, 1200);
		metro.insertUndirectedEdge(minska2, obolon2, 1200);
		metro.insertUndirectedEdge(obolon2, petrivka2, 1600);
		metro.insertUndirectedEdge(petrivka2, tarasa_shevchenka2, 1600);
		metro.insertUndirectedEdge(tarasa_shevchenka2, kontraktova_ploshcha2, 1100);
		metro.insertUndirectedEdge(kontraktova_ploshcha2, poshtova_ploshcha2, 1000);
		metro.insertUndirectedEdge(poshtova_ploshcha2, maidan_nezalezhnosti2, 1000);
		metro.insertUndirectedEdge(maidan_nezalezhnosti2, ploshcha_lva_tolstogo2, 1300);
		metro.insertUndirectedEdge(ploshcha_lva_tolstogo2, olimpiiska_station2, 800);
		metro.insertUndirectedEdge(olimpiiska_station2, palats_ukraina2, 1300);
		metro.insertUndirectedEdge(palats_ukraina2, lybidska2, 900);
		metro.insertUndirectedEdge(lybidska2, demiivska2, 1100);
		metro.insertUndirectedEdge(demiivska2, holosiivska2, 1000);
		metro.insertUndirectedEdge(holosiivska2, vasylkivska2, 1600);
		metro.insertUndirectedEdge(vasylkivska2, vystavkovyi_tsentr2, 1400);
		metro.insertUndirectedEdge(vystavkovyi_tsentr2, ipodrom2, 800);
		metro.insertUndirectedEdge(ipodrom2, teremky2, 1600);

		linea2.add(heroiv_dnipra);
		linea2.add(minska);
		linea2.add(obolon);
		linea2.add(petrivka);
		linea2.add(tarasa_shevchenka);
		linea2.add(kontraktova_ploshcha);
		linea2.add(poshtova_ploshcha);
		linea2.add(maidan_nezalezhnosti);
		linea2.add(ploshcha_lva_tolstogo);
		linea2.add(olimpiiska_station);
		linea2.add(palats_ukraina);
		linea2.add(lybidska);
		linea2.add(demiivska);
		linea2.add(holosiivska);
		linea2.add(vasylkivska);
		linea2.add(vystavkovyi_tsentr);
		linea2.add(ipodrom);
		linea2.add(teremky);

		// Linea 3
		Vertex<Estacion> syrets3 = metro.insertVertex(syrets);
		Vertex<Estacion> dorohozhychi3 = metro.insertVertex(dorohozhychi);
		Vertex<Estacion> lukianivska3 = metro.insertVertex(lukianivska);
		Vertex<Estacion> zoloti_vorota3 = metro.insertVertex(zoloti_vorota);
		Vertex<Estacion> palats_sportu3 = metro.insertVertex(palats_sportu);
		Vertex<Estacion> klovska3 = metro.insertVertex(klovska);
		Vertex<Estacion> pecherska3 = metro.insertVertex(pecherska);
		Vertex<Estacion> druzhby_narodiv3 = metro.insertVertex(druzhby_narodiv);
		Vertex<Estacion> vydubychi3 = metro.insertVertex(vydubychi);
		Vertex<Estacion> slavutych3 = metro.insertVertex(slavutych);
		Vertex<Estacion> osokorky3 = metro.insertVertex(osokorky);
		Vertex<Estacion> pozniaky3 = metro.insertVertex(pozniaky);
		Vertex<Estacion> kharkivska3 = metro.insertVertex(kharkivska);
		Vertex<Estacion> vyrlytsia3 = metro.insertVertex(vyrlytsia);
		Vertex<Estacion> boryspilska3 = metro.insertVertex(boryspilska);
		Vertex<Estacion> hervonyi_khutir3 = metro.insertVertex(hervonyi_khutir);

		metro.insertUndirectedEdge(syrets3, dorohozhychi3, 1300);
		metro.insertUndirectedEdge(dorohozhychi3, lukianivska3, 2700);
		metro.insertUndirectedEdge(lukianivska3, zoloti_vorota3, 2800);
		metro.insertUndirectedEdge(zoloti_vorota3, palats_sportu3, 1200);
		metro.insertUndirectedEdge(palats_sportu3, klovska3, 800);
		metro.insertUndirectedEdge(klovska3, pecherska3, 1200);
		metro.insertUndirectedEdge(pecherska3, druzhby_narodiv3, 1100);
		metro.insertUndirectedEdge(druzhby_narodiv3, vydubychi3, 2000);
		metro.insertUndirectedEdge(vydubychi3, slavutych3, 3400);
		metro.insertUndirectedEdge(slavutych3, osokorky3, 800);
		metro.insertUndirectedEdge(osokorky3, pozniaky3, 1300);
		metro.insertUndirectedEdge(pozniaky3, kharkivska3, 1300);
		metro.insertUndirectedEdge(kharkivska3, vyrlytsia3, 1000);
		metro.insertUndirectedEdge(vyrlytsia3, boryspilska3, 1300);
		metro.insertUndirectedEdge(boryspilska3, hervonyi_khutir3, 1100);

		linea3.add(syrets);
		linea3.add(dorohozhychi);
		linea3.add(lukianivska);
		linea3.add(zoloti_vorota);
		linea3.add(palats_sportu);
		linea3.add(klovska);
		linea3.add(pecherska);
		linea3.add(druzhby_narodiv);
		linea3.add(vydubychi);
		linea3.add(slavutych);
		linea3.add(osokorky);
		linea3.add(pozniaky);
		linea3.add(kharkivska);
		linea3.add(vyrlytsia);
		linea3.add(boryspilska);
		linea3.add(hervonyi_khutir);

		// Transbordos
		metro.insertUndirectedEdge(zoloti_vorota3, Teatralna1, 130 * 2);
		metro.insertUndirectedEdge(Khreshchatyk1, maidan_nezalezhnosti2, 180 * 2);
		metro.insertUndirectedEdge(ploshcha_lva_tolstogo2, palats_sportu3, 100 * 2);
	}

	public Vertex<Estacion> getEstacion(String estacion) {
		Vertex<Estacion> resultado = null;
		for (Vertex<Estacion> s : this.metro.vertices()) {
			if (s.element().getNombre().equals(estacion)) {
				resultado = s;
				break;
			}
		}
		return resultado;
	}

	public UndirectedAdjacencyListGraph<Estacion, Integer> getGraph() {
		return this.metro;
	}

	public int getLinea(Estacion s) {
		if (linea1.contains(s)) {
			return 1;
		}
		if (linea2.contains(s)) {
			return 2;
		}
		return 3;

	}

	public Set<String> getEstacionesNombres() {
		Set<String> result = new HashSet<>();
		for (Estacion e : linea1) {
			result.add(e.getNombre());
		}
		for (Estacion e : linea2) {
			result.add(e.getNombre());
		}
		for (Estacion e : linea3) {
			result.add(e.getNombre());
		}
		return result;
	}
	
	public Set<Estacion> getEstaciones() {
		Set<Estacion> result = new HashSet<>();
		for (Estacion e : linea1) {
			result.add(e);
		}
		for (Estacion e : linea2) {
			result.add(e);
		}
		for (Estacion e : linea3) {
			result.add(e);
		}
		return result;
	}
}
