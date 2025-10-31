package classes;

public class ProgramFactory {

	public ProgramInterface factory(int id) {
		
		if(id==1) {
			return  new Program1();
		}else if(id==2) {
			return new Program2();
		}else if(id==3){
			return new Program3();
		}else {
			return new Program4();
		}
		
	}
}
