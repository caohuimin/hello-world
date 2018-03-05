package inf;


import java.util.ArrayList;

public interface DaoInf<E> {
	public boolean insertData(E data);
	public boolean deleteData(int id);
	//public boolean deleteData(String id);
	public ArrayList<E> selectAllData();
	public ArrayList<E> selectDataById(int id);
	//public E selectDataById(String id);
	public boolean updateData(E data);
}
