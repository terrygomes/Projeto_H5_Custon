package l2mv.gameserver.network.serverpackets;

public class SunSet extends L2GameServerPacket
{
	@Override
	protected final void writeImpl()
	{
		this.writeC(0x13);
	}
}