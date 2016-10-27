//https://www.hackerrank.com/challenges/java-comparator

class Checker implements Comparator<Player> {
	public int compare(Player p1, Player p2) {
		int res = -(p1.score - p2.score);
		if(res != 0) return res;
		return p1.name.compareTo(p2.name);
	}
}