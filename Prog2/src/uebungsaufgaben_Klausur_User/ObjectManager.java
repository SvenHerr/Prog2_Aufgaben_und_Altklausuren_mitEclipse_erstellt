package uebungsaufgaben_Klausur_User;

import java.util.List;

public interface ObjectManager<T >
{
	public void serialize ( List <T > object );
	public List <T > deserialize ();

}