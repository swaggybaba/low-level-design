package FileSystem;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem {
	String directoryName;
	List<FileSystem> fileSystems;
	
	public Directory(String name) {
		this.directoryName=name;
		this.fileSystems=new ArrayList<>();
	}
	
	public void add(FileSystem fileSystem) {
		this.fileSystems.add(fileSystem);
	}
	
	public void ls() {
		System.out.println("Directory Name is "+this.directoryName);
		for(FileSystem fileSystem: fileSystems) {
			fileSystem.ls();
		}
	}
}
