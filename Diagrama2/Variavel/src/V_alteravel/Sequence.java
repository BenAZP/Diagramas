package V_alteravel;

public class Sequence {
	// Atributos
		private long sequenceID;
		private String format;
		
		// Associação com ReferenceSequence
		private Reference_Sequence refseq;
		
		// Métodos de Acesso
		public long getSequenceID() {
			return sequenceID;
		}
		public void setSequenceID(long sequenceID) {
			this.sequenceID = sequenceID;
		}
		public String getFormat() {
			return format;
		}
		public void setFormat(String format) {
			this.format = format;
		}
		public Reference_Sequence getRefseq() {
			return refseq;
		}
		public void setRefseq(Reference_Sequence refseq) {
			this.refseq = refseq;
		}
}
