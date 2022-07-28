package l2mv.gameserver.network.loginservercon.gspackets;

import l2mv.gameserver.network.loginservercon.SendablePacket;

public class OnlineStatus extends SendablePacket
{
	private final boolean _online;

	public OnlineStatus(boolean online)
	{
		this._online = online;
	}

	@Override
	protected void writeImpl()
	{
		this.writeC(0x01);
		this.writeC(this._online ? 1 : 0);
	}
}
