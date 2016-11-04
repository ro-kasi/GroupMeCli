package com.rokasi.gmcli.websocket;

import com.rokasi.gmcli.json.SocketResponse;

public interface GmSocketResponseHandler {
	
	public void handelMessage(SocketResponse message);	

}
