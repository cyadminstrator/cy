package com.opentae.data.user.actions;


import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;


/**
 * Servlet implementation class WebSocket
 */
@ServerEndpoint(value="/webSocket")
public class WebSocket extends WebSocketServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public WebSocket() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * 客户端连接后会调用此方法,创建StreamInbound对象
	 * */
	@Override
	protected StreamInbound createWebSocketInbound(String subProtocol,
			HttpServletRequest request) {
		String clientId = request.getParameter("clientId");
		return new CallCenterMessageInBound(clientId);
	}
	
//	@OnOpen
//	public void start(Session session)
//	{
//	System.out.println("连接成功！ " + session.getId());
//	}

}

