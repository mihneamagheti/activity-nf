/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eu.sante.rasff.novelfood.cdm;

/**
 *
 * WARNING: this canonical data model is configured as a standard pojo for
 * Camunda spin constraints for out-of-the-box serialisation/de-serialisation
 *
 * @author voganlu
 */
//@JsonRootName("restObjectList")
public class Dossier {

	private Long id;
	private String text;

	public void setId(Long id) {
		this.id = id;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Long getId() {
		return id;
	}

	public String getText() {
		return text;
	}

	@Override
	public int hashCode() {
		int hash = 5;
		hash = 19 * hash + (this.id != null ? this.id.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		final Dossier other = (Dossier) obj;
		return !(!this.id.equals(other.id) && (this.id == null || !this.id.equals(other.id)));
	}

	@Override
	public String toString() {
		return "Dossier{" + "id=" + id + ", text=" + text + '}';
	}

}
