package com.wealthsystems.luiz.moco.facade;

public class AssaAbloyFacade implements IAssaAbloyFacade {
	
	public AssaAbloyFacade() {
	}

	@Override
	public String getCliente() {
		return "Default";
	}

	@Override
	public String getClienteExtenso() {
		return "Assa Abloy Default";
	}

	@Override
	public String getCNPJ() {
		return "123456789/0001-00";
	}

	@Override
	public String getEndereco() {
		return "Aquela Rua";
	}

	@Override
	public String getClienteExtensoCPNJ() {
		return getClienteExtenso().concat(" ").concat(getCNPJ());
	}

}
