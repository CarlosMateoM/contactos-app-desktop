package swing.table;

import model.ContactModel;

public interface EventAction {

    public void delete(ContactModel data);

    public void update(ContactModel data);
    
    public void view(ContactModel data);
}
