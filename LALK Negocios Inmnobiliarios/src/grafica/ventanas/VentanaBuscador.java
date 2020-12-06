package grafica.ventanas;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import javax.swing.filechooser.FileNameExtensionFilter;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;

import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.DefaultComboBoxModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JCheckBox;
import javax.swing.JTextPane;
import java.awt.TextArea;
import javax.swing.JTextArea;
import javax.swing.JTabbedPane;
import javax.swing.JButton;
import java.awt.Button;
import javax.swing.UIManager;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

import grafica.controladores.ControladorComparar;
import grafica.controladores.ControladorDelete;
import grafica.controladores.ControladorInsert;
import grafica.controladores.ControladorList;
import logicapersistencia.valueObjects.VOMonedaLista;
import logicapersistencia.valueObjects.VOapartamentos;
import logicapersistencia.valueObjects.VOcasas;
import logicapersistencia.valueObjects.VOinmueble;
import logicapersistencia.valueObjects.VOterrenos;

import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileOutputStream;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.ScrollPaneConstants;

public class VentanaBuscador extends JFrame {

	private Fondo contentPane;
	private JTextField textFieldRutaImagen;
	private JTable table;
	public JLabel label1;
	public JLabel label_2;
	public JLabel label_3;
	public JLabel label_4;
	public JLabel label_5;
	public JLabel label_6;
	public JLabel label_7;
	public JLabel label_8;
	public JLabel label_9;
	public JLabel label_10;
	public JLabel label_11;
	public JLabel label_12;
	private DefaultTableModel modelo;
	private DefaultTableModel modelo2;
	private DefaultTableModel modelo3;
	Icon img = new ImageIcon(getClass().getResource("uy2.png"));
	private JTextField textField;
	private JTable table_Casas;
	private JTable table_Casas_1;
	private JTable table_Aptos;
	private JTable table_Terreno;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaBuscador frame = new VentanaBuscador();
					frame.setVisible(true);
					frame.setResizable(false); //DEJA ESTÁTICA EL TAMAÑO DE LA VENTANA
					frame.setExtendedState(MAXIMIZED_BOTH);// maximisa la ventana
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	
	
	public VentanaBuscador() {
		JComboBox comboBox_TiposSuelos = new JComboBox();
		comboBox_TiposSuelos.setFont(new Font("Tahoma", Font.PLAIN, 20));
		comboBox_TiposSuelos.setModel(new DefaultComboBoxModel(new String[] {"", "BARRIO", "DIRECCION", "REFERENCIA", "EXCLUSIVIDAD", "PROPIETARIO"}));
		JLabel label_Asterisco2 = new JLabel("*");
		label_Asterisco2.setVisible(false);
		JLabel lblImagen = new JLabel("");
		ControladorInsert controladorInsert = new ControladorInsert();

		//------------------------- IMAGEN POR DEFECTO -------------------------------------//
			
				ImageIcon imagenDefecto = new ImageIcon(this.getClass().getResource("img_defecto.png"));
				Image imagDefecto = imagenDefecto.getImage().getScaledInstance(179, 138, Image.SCALE_SMOOTH);
				lblImagen.setIcon(new ImageIcon(imagDefecto));
//				68, 37, 179, 138
		//******************************************************************************************//
		
		setBackground(UIManager.getColor("Button.foreground"));
		setIconImage(Toolkit.getDefaultToolkit().getImage(VentanaBuscador.class.getResource("/grafica/ventanas/uy2.png")));
		setTitle("Gestor de Terreno");

		
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(30, 30, 1316, 769);
		contentPane = new Fondo("primerFondo.jpg");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setOpaque(false);
		panel_1.setBorder(new TitledBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null), "  Control Busquedas  ", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(255, 255, 255)));
		panel_1.setBounds(41, 29, 977, 228);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(41, 268, 1242, 415);
		contentPane.add(tabbedPane);
		
		
		 //***************************************** TABLA CASAS ******************************//
		
		Icon img = new ImageIcon(getClass().getResource("uy2.png"));  
      	
   		Object[] fila = new Object[45];
       
   		table_Casas = new JTable();
       modelo = new DefaultTableModel();

		modelo.addColumn("Ref");
		modelo.addColumn("Moneda");
		modelo.addColumn("Precio");
		modelo.addColumn("Contribución Inmo");
		modelo.addColumn("Area Total");
		modelo.addColumn("Exclusividad");
		modelo.addColumn("Estado");
		modelo.addColumn("Fecha Ingreso");
		modelo.addColumn("Direccion");
		modelo.addColumn("Padrón");
		modelo.addColumn("Barrio");
		modelo.addColumn("Departamento");
		modelo.addColumn("Detalle Estado");
		modelo.addColumn("Detalle Inmueble");
		modelo.addColumn("Año");
		modelo.addColumn("Estado");
		
		modelo.addColumn("IdCasas");
		modelo.addColumn("situación Jurídica");
		modelo.addColumn("Estructura Estado");
		modelo.addColumn("habitación");
		modelo.addColumn("estar");
		modelo.addColumn("dormitorio");
		modelo.addColumn("dorm c/suite");
		modelo.addColumn("dorm social");
		modelo.addColumn("baño");
		modelo.addColumn("baño servicio");
		modelo.addColumn("baño social");
		modelo.addColumn("baño c/jacuzzi");
		modelo.addColumn("fondo");
		modelo.addColumn("patio");
		modelo.addColumn("jardín");
		modelo.addColumn("garaje");
		modelo.addColumn("cochera Abierta");
		modelo.addColumn("cocohera Techada");
		modelo.addColumn("amenities");
		modelo.addColumn("área Edificada");
		modelo.addColumn("metros frente");
		modelo.addColumn("detalle Casa");
		modelo.addColumn("ruta");
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(UIManager.getColor("CheckBox.darkShadow"));
		tabbedPane.addTab("Resultados Casas", null, panel_5, null);
		panel_5.setLayout(null);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane_2.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane_2.setBounds(10, 18, 1217, 358);
		panel_5.add(scrollPane_2);
		
		//*************************** TABLA CASAS *****************************************************//
		
		ControladorList controlador = new ControladorList();
		List<VOcasas> lstCasas = controlador.listarCasas();
			if (lstCasas.size() > 0){	
				Iterator<VOcasas> iterCasa = lstCasas.iterator();
				while (iterCasa.hasNext()){
					VOcasas datosCasa= iterCasa.next();
									
					
					fila[0] = datosCasa.getIdInmueble();
					fila[1] = datosCasa.getTipoMonedaPrecioLista();
					fila[2] = datosCasa.getPrecioLista();
					fila[3] = datosCasa.getContribucionInmobiliaria();
					fila[4] = datosCasa.getAreaTotal();
					fila[5] = datosCasa.getExclusividad();
					fila[6] = datosCasa.getEstadoDisponibilidad();
					fila[7] = datosCasa.getFechaIngreso();
					fila[8] = datosCasa.getDireccion();
					fila[9] = datosCasa.getPadron();
					fila[10] = datosCasa.getBarrio();
					fila[11] = datosCasa.getDepartamento();
					fila[12] = datosCasa.getEstadoDetalle();
					fila[13] = datosCasa.getDetalleInmueble();
					fila[14] = datosCasa.getAntiguedad();
					fila[15] = datosCasa.getEstadoConservacion();
					
					fila[16] = datosCasa.getIdCasa();
					fila[17] = datosCasa.getIdInmueble();
					fila[18] = datosCasa.getSituacionJuridica();
					fila[19] = datosCasa.getEstructura();
					fila[20] = datosCasa.getHabitacionSocial();
					fila[21] = datosCasa.getEstar();
					fila[22] = datosCasa.getDormitorios();
					fila[23] = datosCasa.getDormConSuite();
					fila[24] = datosCasa.getDormSocial();
					fila[25] = datosCasa.getBañoServicio();
					fila[26] = datosCasa.getBañoSocial();
					fila[27] = datosCasa.getBañoConJacuzzi();
					fila[28] = datosCasa.getFondo();
					fila[29] = datosCasa.getPatio();
					fila[30] = datosCasa.getJardin();
					fila[31] = datosCasa.getGaraje();
					fila[32] = datosCasa.getCocheraAbierta();
					fila[33] = datosCasa.getCocheraTechada();
					fila[34] = datosCasa.getAmenities();
					fila[35] = datosCasa.getAreaEdificada();
					fila[36] = datosCasa.getMetrosFrente();
					fila[37] = datosCasa.getDetalleCasa();
					fila[38]= datosCasa.getRutaImagenCasa();
				
		
					modelo.addRow(fila);
				
				}
			}
			table_Casas_1 = new JTable(modelo);
			
			
			
			
		scrollPane_2.setViewportView(table_Casas_1);
		
		// ***************************************** TABLA APARTAMENTOS
		// ******************************//

		

		Object[] fila2 = new Object[45];

		table_Aptos = new JTable();
		modelo2 = new DefaultTableModel();

		modelo2.addColumn("Ref");
		modelo2.addColumn("Moneda");
		modelo2.addColumn("Precio");
		modelo2.addColumn("Contribución Inmo");
		modelo2.addColumn("Area Total");
		modelo2.addColumn("Exclusividad");
		modelo2.addColumn("Estado");
		modelo2.addColumn("Fecha Ingreso");
		modelo2.addColumn("Dirección");
		modelo2.addColumn("Padrón");
		modelo2.addColumn("Barrio");
		modelo2.addColumn("Departamento");
		modelo2.addColumn("Detalle Estado");
		modelo2.addColumn("Detalle Inmueble");
		modelo2.addColumn("Año");
		modelo2.addColumn("Estado");

		modelo2.addColumn("IdApartamento");
		modelo2.addColumn("Unidad");
		modelo2.addColumn("Ubicar Edificio");
		modelo2.addColumn("Ubicar Planta");
		modelo2.addColumn("Habitación Social");
		modelo2.addColumn("Cocina");
		modelo2.addColumn("Monoambiente");
		modelo2.addColumn("Un Ambiente");
		modelo2.addColumn("Dormitorio (c/suite)");
		modelo2.addColumn("Dormitorio (c/vestidor)");
		modelo2.addColumn("Baños");
		modelo2.addColumn("Baño Social");
		modelo2.addColumn("Baño Servicio");
		modelo2.addColumn("Baño Jacuzzi");
		modelo2.addColumn("Balcón");
		modelo2.addColumn("Terraza Principal");
		modelo2.addColumn("Terraza Lavadero");
		modelo2.addColumn("Garaje");
		modelo2.addColumn("Cochera Abierta");
		modelo2.addColumn("Cochera Techada");
		modelo2.addColumn("Amenities");
		modelo2.addColumn("Gastos Comunes");
		modelo2.addColumn("Área Edificada");
		modelo2.addColumn("Detalle Apto");
		modelo2.addColumn("Ruta Imagen");
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(new Color(173, 216, 230));
		panel_5.setBackground(UIManager.getColor("CheckBox.darkShadow"));
		tabbedPane.addTab("Resultados Apartamentos", null, panel_6, null);
		panel_5.setLayout(null);
		panel_6.setLayout(null);

		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(28, 5, 1199, 371);
		panel_6.add(scrollPane_3);
		
		//************************************ TABLA ***********************************//

		ControladorList controlador2 = new ControladorList();
		List<VOapartamentos> lstApto = controlador2.listarApartamentos();
		if (lstApto.size() > 0) {
			Iterator<VOapartamentos> iterApto = lstApto.iterator();
			while (iterApto.hasNext()) {
				VOapartamentos datosApto = iterApto.next();
				
				fila2[0] = datosApto.getIdInmueble();
				fila2[1] = datosApto.getTipoMonedaPrecioLista();
				fila2[2] = datosApto.getPrecioLista();
				fila2[3] = datosApto.getContribucionInmobiliaria();
				fila2[4] = datosApto.getAreaTotal();
				fila2[5] = datosApto.getExclusividad();
				fila2[6] = datosApto.getEstadoDisponibilidad();
				fila2[7] = datosApto.getFechaIngreso();
				fila2[8] = datosApto.getDireccion();
				fila2[9] = datosApto.getPadron();
				fila2[10] = datosApto.getBarrio();
				fila2[11] = datosApto.getDepartamento();
				fila2[12] = datosApto.getEstadoDetalle();
				fila2[13] = datosApto.getDetalleInmueble();
				fila2[14] = datosApto.getAntiguedad();
				fila2[15] = datosApto.getEstadoConservacion();
				
				fila2[16] = datosApto.getIdApartamento();
				
				fila2[17] = datosApto.getUnidad();
				fila2[18] = datosApto.getUbicarEdificio();
				fila2[19] = datosApto.getUbicarPlanta();
				fila2[20] = datosApto.getHabitacionSocial();
				fila2[21] = datosApto.getCocina();
				fila2[22] = datosApto.getMonoambiente();
				fila2[23] = datosApto.getUnAmbiente();
				fila2[24] = datosApto.getDormConSuite();
				fila2[25] = datosApto.getDormConVestidor();
				fila2[26] = datosApto.getBaños();
				fila2[27] = datosApto.getBañoSocial();
				fila2[28] = datosApto.getBañoServicio();
				fila2[29] = datosApto.getBañoJacuzzi();
				fila2[30] = datosApto.getBalcon();
				fila2[31] = datosApto.getTerrazaPrincipal();
				fila2[32] = datosApto.getTerrazaLavadero();
				fila2[33] = datosApto.getGaraje();
				fila2[34] = datosApto.getCochAbierta();
				fila2[35] = datosApto.getCochTechada();
				fila2[36] = datosApto.getAmenities();
				fila2[37] = datosApto.getGastosComunes();
				fila2[38] = datosApto.getAreaEdificada();
				fila2[39] = datosApto.getDetalleApto();
				fila2[40] = datosApto.getRutaImagenApto();
				
				modelo2.addRow(fila2);
			}
		}
		table_Aptos = new JTable(modelo2);

		scrollPane_3.setViewportView(table_Aptos);
		
		
 //***************************************** TABLA INMUEBLES ******************************//
		
		//Icon img = new ImageIcon(getClass().getResource("uy2.png"));  
      	
   		Object[] fila3 = new Object[40];
       
   		table_Terreno = new JTable();
       modelo3 = new DefaultTableModel();
		
		modelo3.addColumn("Ref");
		modelo3.addColumn("Moneda");
		modelo3.addColumn("Precio");
		modelo3.addColumn("Contribución Inmo");
		modelo3.addColumn("Area Total");
		modelo3.addColumn("Exclusividad");
		modelo3.addColumn("Estado");
		modelo3.addColumn("Fecha Ingreso");
		modelo3.addColumn("Direccion");
		modelo3.addColumn("Padrón");
		modelo3.addColumn("Barrio");
		modelo3.addColumn("Departamento");
		modelo3.addColumn("Detalle Estado");
		modelo3.addColumn("Detalle Inmueble");
		modelo3.addColumn("Año");
		modelo3.addColumn("Estado");
		
		modelo3.addColumn("idTerreno");
		modelo3.addColumn("FOS");
		modelo3.addColumn("Altura Edificable");
		modelo3.addColumn("Frente");
		modelo3.addColumn("Situación Jurídica");
		modelo3.addColumn("Productividad");
		modelo3.addColumn("Mejoras");
		modelo3.addColumn("Detalle");
		modelo3.addColumn("RutaImg");
		
		JPanel panel_8 = new JPanel();
		panel_8.setBackground(UIManager.getColor("CheckBox.darkShadow"));
		tabbedPane.addTab("Lista de Terrenos", null, panel_8, null);
		panel_8.setLayout(null);
		
		JScrollPane scrollPane_8 = new JScrollPane();
		scrollPane_8.setBounds(10, 18, 1217, 175);
		panel_8.add(scrollPane_8);
		
	
		//************************************ TABLA TERRENOS ***********************************//
		
		ControladorList controlador3 = new ControladorList();
		List<VOterrenos> lstTerrenos = controlador3.listarTerrenos();
			if (lstTerrenos.size() > 0){	
				Iterator<VOterrenos> iterTerreno = lstTerrenos.iterator();
				while (iterTerreno.hasNext()){
					VOterrenos datosTerreno= iterTerreno.next();
									
					
					fila3[0] = datosTerreno.getRefInmueble();
					fila3[1] = datosTerreno.getTipoMonedaPrecioLista();
					fila3[2] = datosTerreno.getPrecioLista();
					fila3[3] = datosTerreno.getContribucionInmobiliaria();
					fila3[4] = datosTerreno.getAreaTotal();
					fila3[5] = datosTerreno.getExclusividad();
					fila3[6] = datosTerreno.getEstadoDisponibilidad();
					fila3[7] = datosTerreno.getFechaIngreso();
					fila3[8] = datosTerreno.getDireccion();
					fila3[9] = datosTerreno.getPadron();
					fila3[10] = datosTerreno.getBarrio();
					fila3[11] = datosTerreno.getDepartamento();
					fila3[12] = datosTerreno.getEstadoDetalle();
					fila3[13] = datosTerreno.getDetalleInmueble();
					fila3[14] = datosTerreno.getAntiguedad();
					fila3[15] = datosTerreno.getEstadoConservacion();
					
					fila3[16] = datosTerreno.getIdTerreno();
					fila3[17] = datosTerreno.getFOS();
					fila3[18] = datosTerreno.getAlturaEdificable();
					fila3[19] = datosTerreno.getFrente();
					fila3[20] = datosTerreno.getSituacionJuridicaSuelo();
					fila3[21] = datosTerreno.getProductividad();
					fila3[22] = datosTerreno.getConMejoras();
					fila3[23] = datosTerreno.getDetalleInmueble();
					fila3[24] = datosTerreno.getRutaImagenTerreno();
						
					modelo3.addRow(fila3);
				
				}
			}
			table_Terreno = new JTable(modelo3);	
			
			scrollPane_8.setViewportView(table_Terreno);
			
			//**********************************************************//
		
	
		
		JPanel panel_7 = new JPanel();
		panel_7.setOpaque(false);
		panel_7.setBorder(new TitledBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null), "  Fotos      ", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(255, 255, 255)));
		panel_7.setBounds(1054, 29, 222, 228);
		contentPane.add(panel_7);
		panel_7.setLayout(null);
		
		
		lblImagen.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblImagen.setBounds(20, 22, 179, 138);
		panel_7.add(lblImagen);
		
		JLabel lblRuta = new JLabel("Ruta:");
		lblRuta.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblRuta.setForeground(Color.WHITE);
		lblRuta.setBounds(20, 184, 46, 14);
		panel_7.add(lblRuta);
		
		textFieldRutaImagen = new JTextField();
		
		textFieldRutaImagen.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent arg0) {

						if(textFieldRutaImagen.getText().length()>=200){
							arg0.consume();
						}
													
					}
				});
		
		
		textFieldRutaImagen.setFont(new Font("Dialog", Font.BOLD, 12));
		textFieldRutaImagen.setBounds(57, 184, 138, 20);
		panel_7.add(textFieldRutaImagen);
		textFieldRutaImagen.setColumns(10);
		
		Button button_4 = new Button("Cerrar");
		button_4.setForeground(Color.RED);
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
				
			}
		});
		button_4.setFont(new Font("Dialog", Font.BOLD, 15));
		button_4.setBounds(1098, 688, 175, 32);
		contentPane.add(button_4);
		
		
		 JFrame frame = new JFrame();
	     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	       
	       label_Asterisco2.setForeground(Color.RED);
	       label_Asterisco2.setFont(new Font("Tahoma", Font.BOLD, 20));
	       label_Asterisco2.setBounds(429, 169, 28, 14);
	       panel_1.add(label_Asterisco2);
	       
	       JLabel lblTema = new JLabel("Tema:");
	       lblTema.setHorizontalAlignment(SwingConstants.RIGHT);
	       lblTema.setForeground(Color.WHITE);
	       lblTema.setFont(new Font("Tahoma", Font.BOLD, 18));
	       lblTema.setBounds(135, 160, 85, 23);
	       panel_1.add(lblTema);
	       
	       comboBox_TiposSuelos.setBounds(243, 162, 176, 37);
	       panel_1.add(comboBox_TiposSuelos);
	       
	       textField = new JTextField();
	       textField.setHorizontalAlignment(SwingConstants.CENTER);
	       textField.setFont(new Font("Tahoma", Font.BOLD, 15));
	       textField.setBounds(451, 161, 369, 38);
	       panel_1.add(textField);
	       textField.setColumns(10);
	       
	       JSeparator separator = new JSeparator();
	       separator.setBounds(127, 130, 695, 14);
	       panel_1.add(separator);
	       
	       JSeparator separator_1 = new JSeparator();
	       separator_1.setBounds(127, 75, 695, 14);
	       panel_1.add(separator_1);
	       
	       JRadioButton rdbtnRetirado = new JRadioButton("Retirado");
	       JRadioButton rdbtnDisponible = new JRadioButton("Disponible");
	       JRadioButton rdbtnSuspendido = new JRadioButton("Suspendido");
	       
	       rdbtnDisponible.addActionListener(new ActionListener() {
	       	public void actionPerformed(ActionEvent e) {
	       		
	       		rdbtnDisponible.setSelected(true);
	       		rdbtnSuspendido.setSelected(false);
	       		rdbtnRetirado.setSelected(false);	
	       	}
	       });
	       
	       rdbtnSuspendido.addActionListener(new ActionListener() {
		       	public void actionPerformed(ActionEvent e) {
		       		
		       		rdbtnDisponible.setSelected(false);
		       		rdbtnSuspendido.setSelected(true);
		       		rdbtnRetirado.setSelected(false);	
		       	}
		       });
	       
	       rdbtnRetirado.addActionListener(new ActionListener() {
		       	public void actionPerformed(ActionEvent e) {
		       		
		       		rdbtnDisponible.setSelected(false);
		       		rdbtnSuspendido.setSelected(false);
		       		rdbtnRetirado.setSelected(true);	
		       	}
		       });
	       
	       
	       rdbtnDisponible.setFont(new Font("Tahoma", Font.BOLD, 18));
	       rdbtnDisponible.setBackground(Color.BLACK);
	       rdbtnDisponible.setForeground(Color.WHITE);
	       rdbtnDisponible.setBounds(178, 96, 196, 23);
	       panel_1.add(rdbtnDisponible);
	       
	       rdbtnSuspendido.setFont(new Font("Tahoma", Font.BOLD, 18));
	       rdbtnSuspendido.setBackground(Color.BLACK);
	       rdbtnSuspendido.setForeground(Color.WHITE);
	       rdbtnSuspendido.setBounds(409, 96, 212, 23);
	       panel_1.add(rdbtnSuspendido);
	       
	       rdbtnRetirado.setFont(new Font("Tahoma", Font.BOLD, 18));
	       rdbtnRetirado.setBackground(Color.BLACK);
	       rdbtnRetirado.setForeground(Color.WHITE);
	       rdbtnRetirado.setBounds(652, 96, 170, 23);
	       panel_1.add(rdbtnRetirado);
	       
	       JRadioButton rdbtnApartamentos = new JRadioButton("Apartamentos");
	       JRadioButton rdbtnCasa = new JRadioButton("Casas");
	       JRadioButton rdbtnTerrenos = new JRadioButton("Terrenos");
	       
	       
	       rdbtnCasa.addActionListener(new ActionListener() {
	       	public void actionPerformed(ActionEvent arg0) {
	       		
	 	       rdbtnApartamentos.setSelected(false);
		       rdbtnCasa.setSelected(true);
		       rdbtnTerrenos.setSelected(false);
	       	
	       		
	       	}
	       });
	       
	       rdbtnApartamentos.addActionListener(new ActionListener() {
		       	public void actionPerformed(ActionEvent arg0) {
		       		
		       		rdbtnApartamentos.setSelected(true);
		 	       rdbtnCasa.setSelected(false);
		 	       rdbtnTerrenos.setSelected(false);
		       	
		       		
		       	}
		       });
	       
	       rdbtnTerrenos.addActionListener(new ActionListener() {
		       	public void actionPerformed(ActionEvent arg0) {
		       		
		       		rdbtnApartamentos.setSelected(false);
		 	       rdbtnCasa.setSelected(false);
		 	       rdbtnTerrenos.setSelected(true);
		       	
		       		
		       	}
		       });
	       
	
	       rdbtnCasa.setFont(new Font("Tahoma", Font.BOLD, 18));
	       rdbtnCasa.setBackground(Color.BLACK);
	       rdbtnCasa.setForeground(Color.WHITE);
	       rdbtnCasa.setBounds(178, 35, 158, 23);
	       panel_1.add(rdbtnCasa);
	       
	       rdbtnApartamentos.setFont(new Font("Tahoma", Font.BOLD, 18));
	       rdbtnApartamentos.setBackground(Color.BLACK);
	       rdbtnApartamentos.setForeground(Color.WHITE);
	       rdbtnApartamentos.setBounds(409, 35, 212, 23);
	       panel_1.add(rdbtnApartamentos);
	       
	       rdbtnTerrenos.setFont(new Font("Tahoma", Font.BOLD, 18));
	       rdbtnTerrenos.setBackground(Color.BLACK);
	       rdbtnTerrenos.setForeground(Color.WHITE);
	       rdbtnTerrenos.setBounds(652, 35, 158, 23);
	       panel_1.add(rdbtnTerrenos);
	       	         
	       GhostText ghostText14 = new GhostText(textFieldRutaImagen, "img_defecto.png");
	       textFieldRutaImagen.setPreferredSize(new Dimension(300, 24));
	       	       
	       ImageIcon imagen4 = new ImageIcon(VentanaBuscador.class.getResource("flecha.png"));
			
			
			
			
			//------------------------------------ FLECHA CON ACCION ------------------------------//
		       
		       JLabel label_14 = new JLabel("");
		       label_14.setBounds(51, 688, 34, 32);
		       ImageIcon imagenFlecha = new ImageIcon(VentanaBuscador.class.getResource("flecha.png"));
		       Image imagFlecha = imagenFlecha.getImage().getScaledInstance(label_14.getWidth(), label_14.getHeight(), Image.SCALE_SMOOTH);
		       
		       label_14.setIcon(new ImageIcon(imagFlecha));
		       			
		       label_14.addMouseListener(new MouseAdapter() {
		            @Override
		            public void mouseClicked(MouseEvent e) {
		                VentanaPrincipal frameVentanaPrincipal = new VentanaPrincipal();
		                frameVentanaPrincipal.setVisible(true);
		                dispose();
		            }

		        });
		       			
		       
		       contentPane.add(label_14);
		       			
		       			
		      
		
	}
}
