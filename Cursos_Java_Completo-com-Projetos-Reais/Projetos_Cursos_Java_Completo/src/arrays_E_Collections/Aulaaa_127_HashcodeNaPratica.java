package arrays_E_Collections;

public class Aulaaa_127_HashcodeNaPratica {

		String nome;
		Aulaaa_127_HashcodeNaPratica(){
			this.nome = nome;
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
			Aulaaa_127_HashcodeNaPratica other = (Aulaaa_127_HashcodeNaPratica) obj;
			if (nome == null) {
				if (other.nome != null)
					return false;
			} else if (!nome.equals(other.nome))
				return false;
			return true;
		}
		
//		import java.util.HashSet;
//
//		public class Aulaaa_127_HascodeTeste {
//
//			public static void main(String[] args) {
//				HashSet<Aulaaa_127_HashcodeNaPratica> usuarios = new HashSet<Aulaaa_127_HashcodeNaPratica>();
//
//				usuarios.add(new Aulaaa_127_HashcodeNaPratica("Pedro"));
//				usuarios.add(new Aulaaa_127_HashcodeNaPratica("joao"));
//				
//			boolean resultado = usuarios.contains(new Aulaaa_127_HashcodeNaPratica ("Pedro"));
//			}
//
//		}




}
