import java.io.File;
import java.io.IOException;
import java.util.logging.Logger;

public class Main{
	private static final Logger log = Logger.getLogger( Main.class.getName() );

	public static void main(String[] args) {
		if(args.length != 1)//Checking for the argument e.g test.txt
		{
			log.warning("Invalid command line, exactly one argument required");
			System.exit(1);
		}
		
		File path = new File(args[0]);//Getting path
		String fileName = path.getAbsolutePath();
		
		String[] fileLines = null;
		try//Opening the file with ReadFile() and reading its contents with openFile()
		{
			ReadFile file = new ReadFile(fileName);
			fileLines = file.openFile();
		}
		catch(IOException e)
		{
			log.info(e.getMessage());
			System.exit(1);
		}
		//Printing out the contents to screen as test
		for(int i = 0; i < fileLines.length; i++)
		{
			System.out.println(fileLines[i]);
		}

		//TODO Read file format
		//TODO return % RISK
		return;
	}
}
