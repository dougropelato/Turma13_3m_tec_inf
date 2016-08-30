/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tabelas;

/**
 *
 * @author CEDUP TIMBO
 */
public class Mensagens {
    public int codigo_mensagens;
    public int codigo_salas;
    public int codigo_usuarios_origem;
    public int codigo_usuarios_destino;
    public String data_envio_mensagens;
    public String hora_envio_mensagens;
    public String data_recebimento_mensagens;
    public String hora_recebimento_mensagens;

    public int getCodigo_mensagens() {
        return codigo_mensagens;
    }

    public void setCodigo_mensagens(int codigo_mensagens) {
        this.codigo_mensagens = codigo_mensagens;
    }

    public int getCodigo_salas() {
        return codigo_salas;
    }

    public void setCodigo_salas(int codigo_salas) {
        this.codigo_salas = codigo_salas;
    }

    public int getCodigo_usuarios_origem() {
        return codigo_usuarios_origem;
    }

    public void setCodigo_usuarios_origem(int codigo_usuarios_origem) {
        this.codigo_usuarios_origem = codigo_usuarios_origem;
    }

    public int getCodigo_usuarios_destino() {
        return codigo_usuarios_destino;
    }

    public void setCodigo_usuarios_destino(int codigo_usuarios_destino) {
        this.codigo_usuarios_destino = codigo_usuarios_destino;
    }

    public String getData_envio_mensagens() {
        return data_envio_mensagens;
    }

    public void setData_envio_mensagens(String data_envio_mensagens) {
        this.data_envio_mensagens = data_envio_mensagens;
    }

    public String getHora_envio_mensagens() {
        return hora_envio_mensagens;
    }

    public void setHora_envio_mensagens(String hora_envio_mensagens) {
        this.hora_envio_mensagens = hora_envio_mensagens;
    }

    public String getData_recebimento_mensagens() {
        return data_recebimento_mensagens;
    }

    public void setData_recebimento_mensagens(String data_recebimento_mensagens) {
        this.data_recebimento_mensagens = data_recebimento_mensagens;
    }

    public String getHora_recebimento_mensagens() {
        return hora_recebimento_mensagens;
    }

    public void setHora_recebimento_mensagens(String hora_recebimento_mensagens) {
        this.hora_recebimento_mensagens = hora_recebimento_mensagens;
    }
    
}
