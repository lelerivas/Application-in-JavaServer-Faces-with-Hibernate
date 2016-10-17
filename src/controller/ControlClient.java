package controller;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import entity.Client;
import persistence.ClientDao;

@ManagedBean(name = "climb")
public class ControlClient {
	
	private Client client;	
	
	public ControlClient() {
		client = new Client();
	}
	
	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}
	            
	public void registerclient(){
		FacesMessage msg = null;
		try{
			ClientDao cd = new ClientDao();
			cd.insert(client);
			client = new Client();
			msg = new FacesMessage("Cliente registered.");			
		}catch(Exception e){
			e.printStackTrace();
			msg = new FacesMessage("Problem: "+e.getMessage());
		}
		FacesContext contex = FacesContext.getCurrentInstance();
		contex.addMessage("formregister", msg);	
	}
}
