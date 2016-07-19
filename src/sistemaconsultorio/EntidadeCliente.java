package sistemaconsultorio;

public class EntidadeCliente {
    private String nome;
    private long cpf;
    private String sexo;
    private String dataNasc;
    private int idade;
    private String estadoCivil;
    private long fone01;
    private long fone02;
    private long celular;
    private String endereco;
    private String cidade;
    private String uf;
    private String setor;
    private int num;
    private String motivoConsulta;
    private String tratMed;
    private String medicamento;
    private String alergiaMed;
    private String gravidez;
    private int mesGravidez;
    private String anestesia;
    private String reacao;
    private String probCoracao;
    private String probResp;
    private String probRen;
    private String anemia;
    private String hepatite;
    private String desmaio;
    private String hemorragia;
    private String diabetes;
    private String febreReum;
    private String gengiva;
    private String sensibilidade;
    private String fuma;
    
    public EntidadeCliente() {
        this.nome = "";
        this.cpf = 0;
        this.sexo = "";
        this.dataNasc = "";
        this.idade = 0;
        this.estadoCivil = "";
        this.fone01 = 0;
        this.fone02 = 0;
        this.endereco = "";
        this.cidade = "";
        this.uf = "";
        this.setor = "";
        this.num = 0;
        this.motivoConsulta = "";
        this.tratMed = "";
        this.medicamento = "";
        this.alergiaMed = "";
        this.gravidez = "";
        this.mesGravidez = 0;
        this.anestesia = "";
        this.reacao = "";
        this.probCoracao = "";
        this.probResp = "";
        this.probRen = "";
        this.anemia = "";
        this.hepatite = "";
        this.desmaio = "";
        this.hemorragia = "";
        this.diabetes = "";
        this.febreReum = "";
        this.gengiva = "";
        this.sensibilidade = "";
        this.fuma = "";
    }

   public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public long getFone01() {
        return fone01;
    }

    public void setFone01(long fone01) {
        this.fone01 = fone01;
    }

    public long getFone02() {
        return fone02;
    }

    public void setFone02(long fone02) {
        this.fone02 = fone02;
    }

    public long getCelular() {
        return celular;
    }

    public void setCelular(long celular) {
        this.celular = celular;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getMotivoConsulta() {
        return motivoConsulta;
    }

    public void setMotivoConsulta(String motivoConsulta) {
        this.motivoConsulta = motivoConsulta;
    }

    public String getTratMed() {
        return tratMed;
    }

    public void setTratMed(String tratMed) {
        this.tratMed = tratMed;
    }

    public String getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(String medicamento) {
        this.medicamento = medicamento;
    }

    public String getAlergiaMed() {
        return alergiaMed;
    }

    public void setAlergiaMed(String alergiaMed) {
        this.alergiaMed = alergiaMed;
    }

    public String getGravidez() {
        return gravidez;
    }

    public void setGravidez(String gravidez) {
        this.gravidez = gravidez;
    }

    public int getMesGravidez() {
        return mesGravidez;
    }

    public void setMesGravidez(int mesGravidez) {
        this.mesGravidez = mesGravidez;
    }

    public String getAnestesia() {
        return anestesia;
    }

    public void setAnestesia(String anestesia) {
        this.anestesia = anestesia;
    }

    public String getReacao() {
        return reacao;
    }

    public void setReacao(String reacao) {
        this.reacao = reacao;
    }

    public String getProbCoracao() {
        return probCoracao;
    }

    public void setProbCoracao(String probCoracao) {
        this.probCoracao = probCoracao;
    }

    public String getProbResp() {
        return probResp;
    }

    public void setProbResp(String probResp) {
        this.probResp = probResp;
    }

    public String getProbRen() {
        return probRen;
    }

    public void setProbRen(String probRen) {
        this.probRen = probRen;
    }

    public String getAnemia() {
        return anemia;
    }

    public void setAnemia(String anemia) {
        this.anemia = anemia;
    }

    public String getHepatite() {
        return hepatite;
    }

    public void setHepatite(String hepatite) {
        this.hepatite = hepatite;
    }

    public String getDesmaio() {
        return desmaio;
    }

    public void setDesmaio(String desmaio) {
        this.desmaio = desmaio;
    }

    public String getHemorragia() {
        return hemorragia;
    }

    public void setHemorragia(String hemorragia) {
        this.hemorragia = hemorragia;
    }

    public String getDiabetes() {
        return diabetes;
    }

    public void setDiabetes(String diabetes) {
        this.diabetes = diabetes;
    }

    public String getFebreReum() {
        return febreReum;
    }

    public void setFebreReum(String febreReum) {
        this.febreReum = febreReum;
    }

    public String getGengiva() {
        return gengiva;
    }

    public void setGengiva(String gengiva) {
        this.gengiva = gengiva;
    }

    public String getSensibilidade() {
        return sensibilidade;
    }

    public void setSensibilidade(String sensibilidade) {
        this.sensibilidade = sensibilidade;
    }

    public String getFuma() {
        return fuma;
    }

    public void setFuma(String fuma) {
        this.fuma = fuma;
    }
}
