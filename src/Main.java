import java.util.*;
import java.util.logging.Logger;
import java.io.*;

public class Main{
	private static final Logger log = Logger.getLogger( Main.class.getName() );

	public static void main(String[] args) {
		if(args.length != 1)
		{
			System.err.println("Invalid command line, exactly one argument required");
			System.exit(1);
		}
		File inputFile = new File(args[0]);
		System.out.println(inputFile.getAbsolutePath());
		Scanner input = null;
		try {
			input = new Scanner(inputFile);
			System.out.println("HERE");
		} catch (FileNotFoundException e) {
			System.err.println("Cannot Find file - \""+args[0]+"\"");
			System.exit(1);
		}
		//else if(input.)
		//TODO Read file format
		//TODO return % RISK
		input.close();
		return;
	}
}
