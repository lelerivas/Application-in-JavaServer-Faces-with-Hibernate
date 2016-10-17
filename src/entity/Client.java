package entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "tbclient")
public class Client {
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private Integer cod;
		
		@Column(name = "name")
		private String name;
		
		@Column(name = "cpf")
		private String cpf;
		
		@Column(name = "email")
		private String email;
		
		@Column(name = "gender")
		private String gender;
		
		@Column(name = "maritalst")
		private String maritalst;

		public Integer getCod() {
			return cod;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getCpf() {
			return cpf;
		}

		public void setCpf(String cpf) {
			this.cpf = cpf;
			
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getGender() {
			return gender;
		}

		public void setGender(String gender) {
			this.gender = gender;
		}

		public String getMaritalst() {
			return maritalst;
		}

		public void setMaritalst(String maritalst) {
			this.maritalst = maritalst;
		}

		public void setCod(Integer cod) {
			this.cod = cod;
		}
}
