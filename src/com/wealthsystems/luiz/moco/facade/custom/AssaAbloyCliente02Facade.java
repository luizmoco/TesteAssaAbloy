package com.wealthsystems.luiz.moco.facade.custom;

import com.wealthsystems.luiz.moco.facade.AssaAbloyFacade;

public class AssaAbloyCliente02Facade extends AssaAbloyFacade {

	public AssaAbloyCliente02Facade() {
	}

	@Override
	public String getCNPJ() {
		return "123456789/0003-00";
	}

	@Override
	public String getClienteExtensoCPNJ() {
		return getClienteExtenso().concat(" ").concat(getCNPJ());
	}

}
