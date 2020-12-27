import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JLabel;

public class InteractiveDraw {

	private JFrame frame;
	private JTextField red;
	private JTextField green;
	private JTextField blue;
	private JTextField x_corenate;
	private JTextField y_corenate;
	private JTextField redius;
	private JTextField circle_textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InteractiveDraw window = new InteractiveDraw();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public InteractiveDraw() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.PINK);
		frame.setBounds(100, 100, 525, 325);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton color1 = new JButton("Red ");

		color1.setBounds(10, 11, 89, 23);
		frame.getContentPane().add(color1);
		
		JButton btnNewButton = new JButton("Green ");
		btnNewButton.setBounds(102, 11, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Blue");
		btnNewButton_1.setBounds(194, 11, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("X  coordinate ");
		btnNewButton_2.setBounds(10, 61, 113, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Y coordinate ");
		btnNewButton_3.setBounds(115, 61, 105, 23);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Radius");
		btnNewButton_4.setBounds(214, 61, 89, 23);
		frame.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("circle");
		btnNewButton_5.setBounds(280, 11, 89, 23);
		frame.getContentPane().add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("Save");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double XEntery = Double.parseDouble(blue.getText());
				double YEntery = Double.parseDouble(blue.getText());
				double RadiusEntery = Double.parseDouble(blue.getText());
				String shape = circle_textField.getText();
				int redEntery = (int) Double.parseDouble(red.getText());
				int greenEntery = (int) Double.parseDouble(green.getText());
				int blueEntery = (int) Double.parseDouble(blue.getText());
			}
		});
		btnNewButton_6.setBounds(10, 151, 89, 23);
		frame.getContentPane().add(btnNewButton_6);
		
		red = new JTextField();
	
		red.setBounds(13, 34, 86, 20);
		frame.getContentPane().add(red);
		red.setColumns(10);
		
		green = new JTextField();
		green.setBounds(105, 34, 86, 20);
		frame.getContentPane().add(green);
		green.setColumns(10);
		
		blue = new JTextField();
		blue.setBounds(194, 34, 86, 20);
		frame.getContentPane().add(blue);
		blue.setColumns(10);
		
		x_corenate = new JTextField();
		x_corenate.setBounds(13, 82, 86, 20);
		frame.getContentPane().add(x_corenate);
		x_corenate.setColumns(10);
		
		y_corenate = new JTextField();
		y_corenate.setBounds(125, 82, 86, 20);
		frame.getContentPane().add(y_corenate);
		y_corenate.setColumns(10);
		
		redius = new JTextField();
		redius.setBounds(214, 82, 86, 20);
		frame.getContentPane().add(redius);
		redius.setColumns(10);

		circle_textField = new JTextField();
		circle_textField.setBounds(283, 34, 86, 20);
		frame.getContentPane().add(circle_textField);
		circle_textField.setColumns(10);
		
		JButton btnNewButton_7 = new JButton("Load");
		btnNewButton_7.setBounds(10, 210, 89, 23);
		frame.getContentPane().add(btnNewButton_7);
		
		JLabel lblNewLabel = new JLabel("loading objects to the file");
		lblNewLabel.setBounds(10, 185, 131, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("save object in LinkedQueue");
		lblNewLabel_1.setBounds(10, 126, 154, 14);
		frame.getContentPane().add(lblNewLabel_1);
	}
}
