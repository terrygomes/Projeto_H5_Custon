package l2mv.gameserver.network.serverpackets;

public class PartySmallWindowDeleteAll extends L2GameServerPacket
{
	public static final L2GameServerPacket STATIC = new PartySmallWindowDeleteAll();

	@Override
	protected final void writeImpl()
	{
		this.writeC(0x50);
	}
}