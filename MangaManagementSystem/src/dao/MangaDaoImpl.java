package dao;

import java.util.ArrayList;
import java.util.List;

import pojo.MangaPojo;

public class MangaDaoImpl implements MangaDao {
	//declare the object list here
	List<MangaPojo> allManga;
	
	//constructor initialize instance var here
	public MangaDaoImpl() {
		allManga = new ArrayList<MangaPojo>();
		
		allManga.add(new MangaPojo(001, "One Piece", "Oda Eiichiro", "Advanture Fiction", 10, ""));
		allManga.add(new MangaPojo(002, "Naruto", "Masashi Kishimoto", "Fantasy", 12, ""));
		allManga.add(new MangaPojo(003, "Dragon Ball", "Akira Toriyama", "Action", 9, ""));
	}
	
	
	
	@Override
	public List<MangaPojo> fetchAllManga() {
		return allManga;
	}

	@Override
	public MangaPojo addManga(MangaPojo mangaPojo) {
		
		int newMangaId = allManga.get(allManga.size()-1).getMangaId()+1;
		mangaPojo.setMangaId(newMangaId);
		allManga.add(mangaPojo);
		return mangaPojo;
		
	}

	@Override
	public MangaPojo updateManga(MangaPojo mangaPojo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MangaPojo deleteManga(int mangaId) {
		MangaPojo returnMangaPojo = null;
		
		for (int i = 0; i < allManga.size(); i++) {
			if (allManga.get(i).getMangaId() == mangaId) {
				returnMangaPojo = allManga.get(i);
				allManga.remove(i);
			}
		}
		return returnMangaPojo;
	}

	@Override
	public MangaPojo fetchAManga(int mangaId) {
		MangaPojo returnMangaPojo = null;
		
		for (int i = 0; i < allManga.size(); i++) {
			if (allManga.get(i).getMangaId() == mangaId) {
				returnMangaPojo = allManga.get(i);
			}
		}
		return returnMangaPojo;
	}

}
