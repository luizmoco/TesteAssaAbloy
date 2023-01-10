package com.wealthsystems.luiz.moco.facade.custom;

import com.wealthsystems.luiz.moco.facade.AssaAbloyFacade;

public class AssaAbloyUdineseFacade extends AssaAbloyFacade {
	
	public AssaAbloyUdineseFacade() {
	}

	@Override
	public String getCliente() {
		return "Udinese";
	}

	@Override
	public String getClienteExtenso() {
		return "Assa Abloy Udinese";
	}

	@Override
	public String getCNPJ() {
		return "123456789/0002-00";
	}

}
