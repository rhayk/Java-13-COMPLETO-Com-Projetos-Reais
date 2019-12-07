package arrays_E_Collections;

public class Aulaaa_123_List_classe {

	
		String nome;
		
		Aulaaa_123_List_classe (String nome){
			this.nome = nome;
		}
		
		public String toString() {
			return "Meu nome � " +this.nome+ ".";
		}
		
		
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((nome == null) ? 0 : nome.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Aulaaa_123_List_classe other = (Aulaaa_123_List_classe) obj;
			if (nome == null) {
				if (other.nome != null)
					return false;
			} else if (!nome.equals(other.nome))
				return false;
			return true;
		}

	

}
