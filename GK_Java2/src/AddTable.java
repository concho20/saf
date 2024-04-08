import java.awt.Component;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;

public class AddTable {
	public void AddTable_BangLuong(View v) {		
		JTable table_BangLuong = v.getTable_BangLuong();
	
		try {
			Connection connection = ConnectionDatabase.connect();
			if (connection != null) {
				String sql = "SELECT * FROM BangLuong";
				ResultSet resultSet = ConnectionDatabase.executeQuery(sql, connection);

				DefaultTableModel tableModel = new DefaultTableModel();

				ResultSetMetaData metaData1 = resultSet.getMetaData();
				int columnCount1 = metaData1.getColumnCount();

				for (int columnIndex = 1; columnIndex <= columnCount1; columnIndex++) {
                tableModel.addColumn(metaData1.getColumnName(columnIndex));
				}

				while (resultSet.next()) {
					Object[] rowData = new Object[columnCount1];
					for (int columnIndex = 1; columnIndex <= columnCount1; columnIndex++) {
						rowData[columnIndex - 1] = resultSet.getObject(columnIndex);
					}
					tableModel.addRow(rowData);
				}
            
				table_BangLuong.setModel(tableModel);

				for (int columnIndex = 0; columnIndex < table_BangLuong.getColumnCount(); columnIndex++) {
					TableColumn column = table_BangLuong.getColumnModel().getColumn(columnIndex);
					int maxWidth = 0;
					for (int rowIndex = 0; rowIndex < table_BangLuong.getRowCount(); rowIndex++) {
						TableCellRenderer cellRenderer = table_BangLuong.getCellRenderer(rowIndex, columnIndex);
						Object value = table_BangLuong.getValueAt(rowIndex, columnIndex);
						Component cellComponent = cellRenderer.getTableCellRendererComponent(v.getTable_MucLuong(), value, false, false, rowIndex, columnIndex);
						maxWidth = Math.max(cellComponent.getPreferredSize().width, maxWidth);
					}
					column.setPreferredWidth(maxWidth + 10); 
				}
            
				DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
				centerRenderer.setHorizontalAlignment(JLabel.CENTER);
				for (int i = 0; i < v.getTable_MucLuong().getColumnCount(); i++) {
					if(i != 1) {
						v.getTable_MucLuong().getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
					}      
				}

            
				ConnectionDatabase.disconnect(connection);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}		
	}	
	
	public void AddTable_MucLuong(View v) {		
		JTable table_MucLuong = v.getTable_MucLuong();
	
		try {
	        Connection connection = ConnectionDatabase.connect();
	        if (connection != null) {
	            String sql = "SELECT * FROM MucLuong";
	            ResultSet resultSet = ConnectionDatabase.executeQuery(sql, connection);

	            DefaultTableModel tableModel = new DefaultTableModel();

	            ResultSetMetaData metaData1 = resultSet.getMetaData();
	            int columnCount1 = metaData1.getColumnCount();

	            for (int columnIndex = 1; columnIndex <= columnCount1; columnIndex++) {
	                tableModel.addColumn(metaData1.getColumnName(columnIndex));
	            }

	            while (resultSet.next()) {
	                Object[] rowData = new Object[columnCount1];
	                for (int columnIndex = 1; columnIndex <= columnCount1; columnIndex++) {
	                    rowData[columnIndex - 1] = resultSet.getObject(columnIndex);
	                }
	                tableModel.addRow(rowData);
	            }
	            
	            table_MucLuong.setModel(tableModel);

	            for (int columnIndex = 0; columnIndex < table_MucLuong.getColumnCount(); columnIndex++) {
	                TableColumn column = table_MucLuong.getColumnModel().getColumn(columnIndex);
	                int maxWidth = 0;
	                for (int rowIndex = 0; rowIndex < table_MucLuong.getRowCount(); rowIndex++) {
	                    TableCellRenderer cellRenderer = table_MucLuong.getCellRenderer(rowIndex, columnIndex);
	                    Object value = table_MucLuong.getValueAt(rowIndex, columnIndex);
	                    Component cellComponent = cellRenderer.getTableCellRendererComponent(table_MucLuong, value, false, false, rowIndex, columnIndex);
	                    maxWidth = Math.max(cellComponent.getPreferredSize().width, maxWidth);
	                }
	                column.setPreferredWidth(maxWidth + 10); 
	            }
	            
	            DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
	            centerRenderer.setHorizontalAlignment(JLabel.CENTER);
	            for (int i = 0; i < table_MucLuong.getColumnCount(); i++) {
	            		table_MucLuong.getColumnModel().getColumn(i).setCellRenderer(centerRenderer); 
	            }

	            
	            ConnectionDatabase.disconnect(connection);
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	}
}
