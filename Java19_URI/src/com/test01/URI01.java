package com.test01;

import java.net.URI;
import java.net.URISyntaxException;

public class URI01 {

	public static void main(String[] args) throws URISyntaxException {
		URI u = new URI("http://localhost:8787/Java19_URI/res.jsp?name=lee&addr=seoul");
		
		System.out.println(u.getScheme());
		System.out.println(u.getHost());
		System.out.println(u.getPort()); //8787 ��Ʈ
		System.out.println(u.getQuery());
	}
/*IP : ��Ʈ/���α׷� / 
 * 1.URL : Uniform Resource Locator �ּ�(��ġ)
 * 			Ư�� ������ �ϳ��� ���ҽ��� ���� ��ü���� ��ġ�� ����.
 * 2.URN : Uniform resource Name ���(�̸�)
 * 			�������� �̷�� �� ���ҽ��� ����, �� ���ҽ��� ��ġ�� ���� ���� �ʴ� ���� ������ �̸� ����
 * 3.URI : Uniform Resource Identifier �ĺ���
 * 			URL + URN = URI
 * 
 * 
 * 
 * 
 */
	
	
	
	
	
	
	
}
