
package uaspl;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JList;
public class ListManage {
    JList component;
    DefaultListModel model = new DefaultListModel();
    
    public ListManage(JList component){
        this.component = component;
        for (int i = 0; i < component.getModel().getSize(); i++){
            model.addElement((String) component.getModel().getElementAt(i));
        }
    }
 
    public void addItem(Object item) {
        model.addElement(item);
        component.setModel(model);
    }

    public Boolean contains(Object item){
        return getList().contains(item);
    }    

    public String getItem(int index){
        return (String) component.getModel().getElementAt(index);
    }
    
    public List<String> getList(){
        List<String> list = new ArrayList<>();
        for (int i = 0; i < component.getModel().getSize(); i++){
            list.add((String) component.getModel().getElementAt(i));
        }
        return list;
    } 
}
