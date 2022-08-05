
package swing.table;

import model.ContactModel;

public class ModelAction {
    
    private EventAction event;
    private ContactModel contactModel;

    public ModelAction(EventAction event, ContactModel contactModel) {
        this.event = event;
        this.contactModel = contactModel;
    }

    public EventAction getEvent() {
        return event;
    }

    public void setEvent(EventAction event) {
        this.event = event;
    }

    public ContactModel getContactModel() {
        return contactModel;
    }

    public void setContactModel(ContactModel contactModel) {
        this.contactModel = contactModel;
    }
    
}
