package source;

import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.formdev.flatlaf.FlatLightLaf;

import es.upm.aedlib.graph.Vertex;

import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.Set;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.JList;
import javax.swing.JSplitPane;
import javax.swing.ListSelectionModel;
import javax.swing.UIManager;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.BoxLayout;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;

import java.awt.Component;
import javax.swing.Box;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.ListModel;
import javax.swing.ScrollPaneConstants;
import javax.swing.JComboBox;
import java.awt.Font;
import java.awt.SystemColor;

public class Window extends JFrame {

	private JPanel contentPane;
	private int clickCounter = 0;

	// 0->1->2->0

	/**
	 * Create the frame.
	 */
	public Window(Metro metro) {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Window.class.getResource("/images/kiev-metro-logo.png")));
		setTitle("Metro Kiev");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1400, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));

		Component horizontalStrut_1 = Box.createHorizontalStrut(20);
		contentPane.add(horizontalStrut_1);

		JPanel left_panel = new JPanel();
		contentPane.add(left_panel);
		left_panel.setLayout(new BoxLayout(left_panel, BoxLayout.Y_AXIS));

		Mapa right_panel = new Mapa();

		contentPane.add(right_panel);
		JLabel map_image = new JLabel("");

		ImageIcon mapa_imageicon = new ImageIcon(Window.class.getResource("/images/mapaHD.PNG"));
		FlowLayout fl_right_panel = new FlowLayout(FlowLayout.CENTER, 5, 5);
		right_panel.setLayout(fl_right_panel);
		map_image.setIcon(mapa_imageicon);
		right_panel.add(map_image);

		JLabel metro_label = new JLabel("Metro Kiev");
		metro_label.setAlignmentX(Component.CENTER_ALIGNMENT);
		ImageIcon metrologo_imageicon = new ImageIcon(Window.class.getResource("/images/kiev-metro-logo.png"));
		Image metro_image = metrologo_imageicon.getImage();
		Image metro_image_resized = metro_image.getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH);
		metrologo_imageicon = new ImageIcon(metro_image_resized);
		metro_label.setIcon(metrologo_imageicon);
		left_panel.add(metro_label);

		JPanel org_dest_panel = new JPanel();
		left_panel.add(org_dest_panel);

		JPanel org_panel = new JPanel();
		org_dest_panel.add(org_panel);
		org_panel.setLayout(new BoxLayout(org_panel, BoxLayout.Y_AXIS));

		JLabel org_label = new JLabel("Origen:");
		org_label.setAlignmentX(Component.RIGHT_ALIGNMENT);
		org_panel.add(org_label);
		DefaultComboBoxModel<String> org_list_model = new DefaultComboBoxModel<String>();
		for (String s : metro.getEstacionesNombres()) {
			org_list_model.addElement(s);
		}
		DefaultComboBoxModel<String> dest_list_model = new DefaultComboBoxModel<String>();
		for (String s : metro.getEstacionesNombres()) {
			dest_list_model.addElement(s);
		}

		JComboBox<String> org_comboBox = new JComboBox<String>(org_list_model);
		org_panel.add(org_comboBox);

		JPanel dest_panel = new JPanel();
		org_dest_panel.add(dest_panel);
		dest_panel.setLayout(new BoxLayout(dest_panel, BoxLayout.Y_AXIS));

		JLabel dest_label = new JLabel("Destino:");
		dest_label.setAlignmentX(Component.RIGHT_ALIGNMENT);
		dest_panel.add(dest_label);

		JComboBox<String> dest_comboBox = new JComboBox<String>(dest_list_model);
		dest_panel.add(dest_comboBox);

		JLabel distancia_label = new JLabel("");
		distancia_label.setForeground(SystemColor.textHighlight);
		distancia_label.setFont(new Font("Tahoma", Font.PLAIN, 18));
		distancia_label.setAlignmentX(Component.CENTER_ALIGNMENT);

		JLabel time_label = new JLabel("");
		time_label.setForeground(SystemColor.textHighlight);
		time_label.setFont(new Font("Tahoma", Font.PLAIN, 18));
		time_label.setAlignmentX(0.5f);

		JButton calculate_button = new JButton("Calcular Ruta");
		calculate_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String org = (String) org_comboBox.getSelectedItem();
				String dest = (String) dest_comboBox.getSelectedItem();
				if (!org.equals(dest)) {
					Vertex<Estacion> estacion_org = Main.metro.getEstacion(org);
					Vertex<Estacion> estacion_dest = Main.metro.getEstacion(dest);
					Algoritmo alg = new Algoritmo(estacion_org, estacion_dest, Main.metro.getGraph());
					ArrayList<Estacion> camino = alg.calcSol();
					right_panel.setCamino(camino);
					right_panel.repaint();
					int distancia = 0;
					for (int i = 1; i < camino.size(); i++) {
						distancia += camino.get(i).getDistancia();
					}
					float distanciaKm = distancia / 1000;

					distancia_label.setText("Distancia a destino: " + distanciaKm + " Km");
					time_label.setText("Tiempo aproximado de trayecto: "
							+ (int) ((distanciaKm / 36) * 60 + camino.size() * 0.7) + " mins");
				} else {
					distancia_label.setText("El origen y el destino es la misma parada");
					time_label.setText("");
				}

			}
		});
		calculate_button.setAlignmentX(Component.CENTER_ALIGNMENT);
		left_panel.add(calculate_button);

		Component verticalStrut = Box.createVerticalStrut(20);
		left_panel.add(verticalStrut);

		left_panel.add(distancia_label);

		left_panel.add(time_label);

		Component horizontalStrut_1_1 = Box.createHorizontalStrut(20);
		contentPane.add(horizontalStrut_1_1);

		right_panel.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int x = e.getX();
				int y = e.getY();
				for (Estacion estacion : metro.getEstaciones()) {
					if (x >= estacion.getX() - 10 && x <= estacion.getX() + 10 && y >= estacion.getY() - 10
							&& y <= estacion.getY() + 10) {
						if (clickCounter == 0) {
							//SET ORIGEN
							clickCounter = 1;
							org_comboBox.setSelectedItem(estacion.getNombre());
							right_panel.setOrigen((Graphics2D)right_panel.getGraphics(), estacion.getX(), estacion.getY());
						}else if(clickCounter == 1) {
							clickCounter = 0;
							dest_comboBox.setSelectedItem(estacion.getNombre());
							right_panel.setDestino((Graphics2D)right_panel.getGraphics(), estacion.getX(), estacion.getY());
						}
						break;
					}
				}
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub

			}

		});

	}
}
