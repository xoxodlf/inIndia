package phonebook;

import java.util.ArrayList;

interface contactDAO {
	void insertContact(contact insert);
	void deleteContact(String phoneNum);
	void updateContact(String phoneNum,contact update);
	contact searchContactByNumber(String s);
	ArrayList<contact> searchContactByName(String s);
	ArrayList<contact> listAll();
}
