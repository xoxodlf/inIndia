package java_0621;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class TableEx {

	public static void main(String[] args) {
		JFrame f = new JFrame("Table Example");
		
		String data[][] = {{"101", "Amit", "670000"}, {"102", "Jai", "780000"}, {"101", "Sachin", "700000"}};
		String column[] = {"ID", "NAME", "SALARY"};
		
		final JTable jt = new JTable(data, column);
		jt.setCellSelectionEnabled(true);
		
		ListSelectionModel select = jt.getSelectionModel();
//		select.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		select.addListSelectionListener(new ListSelectionListener() {
			
			@Override
			public void valueChanged(ListSelectionEvent e) {
				String data = null;
				int[] row = jt.getSelectedRows();
				int[] columns = jt.getSelectedColumns();
				
				for (int i = 0; i < row.length; i++) {
					for (int j = 0; j < column.length; j++) {
						data = (String) jt.getValueAt(row[i], columns[i]);
					}
				}
				System.out.println("Table element selected is : " + data);
			}
		});
		
		JScrollPane sp = new JScrollPane(jt);
		
		f.add(sp);
		
		f.setSize(500, 500);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
