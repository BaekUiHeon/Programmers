package lv1.one;

import java.util.HashMap;
import java.util.Map;

public class Race {	//달리기 경주 
    
	public String[] solution(String[] players, String[] callings) {
    	Map<String,Integer> playermap = new HashMap<>();
    	Map<Integer,String> playerRank = new HashMap<>();
    	
    	for(int i=0;i<players.length;i++) {
    		playermap.put(players[i],i);
    		playerRank.put(i,players[i]);
    	}
    	
    	int rank;
    	String calledPlayer;
    	String prevPlayer;
    	for(int i=0;i<callings.length;i++) {
    		calledPlayer=callings[i];
    		rank=playermap.get(calledPlayer);
    		prevPlayer=playerRank.get(rank-1);
    		playermap.put(prevPlayer, rank);
    		playermap.put(calledPlayer,rank-1);
    		playerRank.put(rank,prevPlayer);
    		playerRank.put(rank-1, calledPlayer);
    	}
    	for(int i=0; i<playermap.size();i++) {
    		players[i]=playerRank.get(i);
    	}
    	return players;
    }
}
