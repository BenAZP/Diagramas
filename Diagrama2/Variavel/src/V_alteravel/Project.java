package V_alteravel;

public class Project {
	// Atributos
		private String name;
		private String description;
		
		// Agregação com Source
		public Source source = new Source();
		// Agregação com Alignment
		public Alignment alignment = new Alignment();
		// Agregação com ReferenceSequence
		public Reference_Sequence refseq = new Reference_Sequence();
		// Agregação com Feature
		public Feature feature = new Feature();
		
		// Métodos
		public void agreg_Source() {
			// TODO
		}
		
		public void agreg_Alignment() {
			// TODO
		}
		
		public void agreg_ReferenceSequence() {
			// TODO
		}
		
		public void agreg_Feature() {
			// TODO
		}
		
		// Métodos de Acesso
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

}
