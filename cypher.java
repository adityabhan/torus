package test;
public class cypher
{
	private static int[] chain={
		1232,3234,1231,1455,1564
	};

	static public String encrypt(String key)//call this function for encryption
	{	int ck=0;
		String code="";
		char ch;
		for(int i=0;i<key.length();i++)
		{
			ch=key.charAt(i);
			ch+=chain[ck++];
			code+=ch;
			if(ck>=chain.length-1)ck=0;
		}		
		return code;
	}
	static public String decrypt(String key)//call this function for decryption
	{
		int ck=0;
		String code="";
		char ch;
		for(int i=0;i<key.length();i++)
		{
			ch=key.charAt(i);
			ch-=chain[ck++];
			code+=ch;
			if(ck>=chain.length-1)ck=0;
	
		}		
		return code;
	}
}