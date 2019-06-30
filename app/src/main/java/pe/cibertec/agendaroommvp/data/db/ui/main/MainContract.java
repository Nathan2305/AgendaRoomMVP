package pe.cibertec.agendaroommvp.data.db.ui.main;

import java.util.List;

import pe.cibertec.agendaroommvp.data.db.model.Contact;

public interface MainContract {

    interface MainView{
        void showContacts(List<Contact> contacts);
    }

    interface MainPresenter{ //Maneja la lógica
        void getAllContacts();
        void addContact(Contact contact);
    }
}
