package com.string;

public class BombedStringExample
{

	public static void main(String[] args)
	{

		String str = "abcccddbcaab";
		StringBuilder sb = new StringBuilder(str);

		for (int i = 0; i < sb.length(); i++)
		{
			boolean flag = false;
			int occurrence = 1;
			for (int j = i + 1; j < sb.length(); j++)
			{
				if (sb.charAt(i) == sb.charAt(j))
				{
					flag = true;
					occurrence++;
				}
				else
				{
					break;
				}
			}

			if (flag)
			{
				// remove the bombarded string
				sb.delete(i, occurrence + i);
				i = 0;
				System.out.println("steps :"+sb.toString());
			}

		}
		System.out.println(sb.toString());
	}

}
