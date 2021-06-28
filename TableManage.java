package uaspl;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class TableManage {
JTable component;
    DefaultTableModel model = new DefaultTableModel();
    
    public TableManage(JTable component){
        this.component = component;
        this.model = (DefaultTableModel) component.getModel();
    }
    
    public void addRow(Object[] data){
        model.addRow(data);
    }
    
    public int getColumnCount(){
        return model.getColumnCount();
    }
    
    public int getRowCount(){
        return model.getRowCount();
    }
    
    public void setValue(Object value, int row, int column){
        model.setValueAt(value, row, column);
    }
    
}