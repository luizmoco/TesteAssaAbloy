package com.wealthsystems.luiz.moco;

import com.wealthsystems.luiz.moco.facade.AssaAbloyFacade;
import com.wealthsystems.luiz.moco.facade.IAssaAbloyFacade;
import com.wealthsystems.luiz.moco.facade.custom.AssaAbloyCliente02Facade;
import com.wealthsystems.luiz.moco.facade.custom.AssaAbloyUdineseFacade;

public class Main {

	public static void main(String[] args) {
		IAssaAbloyFacade facade = new AssaAbloyFacade();

		System.out.println(facade.getCliente());
		System.out.println(facade.getClienteExtenso());
		System.out.println(facade.getCNPJ());
		System.out.println(facade.getEndereco());
		System.out.println(facade.getClienteExtensoCPNJ());
		System.out.println("-------------------------------------");

		facade = new AssaAbloyUdineseFacade();

		System.out.println(facade.getCliente());
		System.out.println(facade.getClienteExtenso());
		System.out.println(facade.getCNPJ());
		System.out.println(facade.getEndereco());
		System.out.println(facade.getClienteExtensoCPNJ());
		System.out.println("-------------------------------------");
		
		facade = new AssaAbloyCliente02Facade();
		
		System.out.println(facade.getCliente());
		System.out.println(facade.getClienteExtenso());
		System.out.println(facade.getCNPJ());
		System.out.println(facade.getEndereco());
		System.out.println(facade.getClienteExtensoCPNJ());
	}

}
