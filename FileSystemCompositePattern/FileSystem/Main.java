package FileSystem;

public class Main {

	public static void main(String[] args) {
		Directory movieDirectory=new Directory("Movie");
		FileSystem movie=new File("Border");
		movieDirectory.add(movie);
		
		Directory comedyMovieDirectory=new Directory("ComedyMovie");
		FileSystem comedyMovie=new File("Phir Hera Pheri");
		comedyMovieDirectory.add(comedyMovie);
		
		movieDirectory.add(comedyMovieDirectory);
		
		movieDirectory.ls();
	}

}
