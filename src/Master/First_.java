package Master;

import java.io.*;
public class First_ 
{
	static void file() throws IOException
	{
		File file=new File("D:/Project/Measurment_unit");
		
			System.out.println("Cretaed "+file.createNewFile());
		
		System.out.println("File Open "+file.canWrite());
		System.out.println("File Open "+file.exists());
		System.out.println("File Open "+file.getName());
		System.out.println("File Open "+file.length());
	}
	static void file1() throws IOException
	{
		File file=new File("D:/Project/Category");
		
		System.out.println("Cretaed "+file.createNewFile());
	}
	/*static void Mesurment_unit() throws IOException
	{
		int i;		
		FileOutputStream FileOutputStream=new FileOutputStream("D:\\\\Admin",true);
		String s = "Durgesh";
		char ch[]=s.toCharArray();
		try {
		for ( i = 0; i < s.length(); i++)
			FileOutputStream.write(ch[i]);
			FileOutputStream.close();
			
		}
			catch (IOException e)
			{
				e.printStackTrace();
				// TODO: handle exception
			}
		}*/
	static void create_folder_in_file() throws IOException
	{
		File file=new File("D:/Project");
		if(file.mkdir())
		{
			System.out.println("Folder created !!!!!!!");
		}
		else
		{
		System.out.println("Folder Not created !!!!!!!");
		}
		
		
	}
	static void file_open()
	{
		File file =new File("D:/Project/Admin");
		
		System.out.println("File Open "+file.getName());
		System.out.println("File directory   "+file.toPath());
		
	}
	
	
	
}
