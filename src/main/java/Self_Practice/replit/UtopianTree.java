package replit;

public class UtopianTree {

	public static void main(String[] args) {

		int growth =1, treeSize=0;
		for (int i=1;i<=10;i++) {
			if (i>3) {
				growth = 2;
			}
			treeSize +=growth;
			System.out.println("year "+i +" - growth "+growth+" cm");
			System.out.println("tree size: "+treeSize+"cm");
		}
		
	}

}
