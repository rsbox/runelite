/*
 * This file is generated by jOOQ.
 */
package net.runelite.client.database.data;


import javax.annotation.Generated;
import net.runelite.client.database.data.tables.Loottrackerevents;
import net.runelite.client.database.data.tables.Loottrackerlink;
import net.runelite.client.database.data.tables.Loottrackerloot;
import net.runelite.client.database.data.tables.User;
import org.jooq.Index;
import org.jooq.OrderField;
import org.jooq.impl.Internal;


/**
 * A class modelling indexes of tables of the <code>PUBLIC</code> schema.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.11.12"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class Indexes
{

	// -------------------------------------------------------------------------
	// INDEX definitions
	// -------------------------------------------------------------------------

	public static final Index PRIMARY_KEY_B = Indexes0.PRIMARY_KEY_B;
	public static final Index FK_LOOTTRACKEREVENT_INDEX_6 = Indexes0.FK_LOOTTRACKEREVENT_INDEX_6;
	public static final Index FK_LOOTTRACKERLOOT_INDEX_6 = Indexes0.FK_LOOTTRACKERLOOT_INDEX_6;
	public static final Index PRIMARY_KEY_6B = Indexes0.PRIMARY_KEY_6B;
	public static final Index PRIMARY_KEY_6 = Indexes0.PRIMARY_KEY_6;
	public static final Index PRIMARY_KEY_2 = Indexes0.PRIMARY_KEY_2;

	// -------------------------------------------------------------------------
	// [#1459] distribute members to avoid static initialisers > 64kb
	// -------------------------------------------------------------------------

	private static class Indexes0
	{
		public static Index PRIMARY_KEY_B = Internal.createIndex("PRIMARY_KEY_B", Loottrackerevents.LOOTTRACKEREVENTS, new OrderField[]{Loottrackerevents.LOOTTRACKEREVENTS.UNIQUEID}, true);
		public static Index FK_LOOTTRACKEREVENT_INDEX_6 = Internal.createIndex("FK_LOOTTRACKEREVENT_INDEX_6", Loottrackerlink.LOOTTRACKERLINK, new OrderField[]{Loottrackerlink.LOOTTRACKERLINK.EVENTUNIQUEID}, false);
		public static Index FK_LOOTTRACKERLOOT_INDEX_6 = Internal.createIndex("FK_LOOTTRACKERLOOT_INDEX_6", Loottrackerlink.LOOTTRACKERLINK, new OrderField[]{Loottrackerlink.LOOTTRACKERLINK.DROPUNIQUEID}, false);
		public static Index PRIMARY_KEY_6B = Internal.createIndex("PRIMARY_KEY_6B", Loottrackerlink.LOOTTRACKERLINK, new OrderField[]{Loottrackerlink.LOOTTRACKERLINK.LINKUNIQUEID}, true);
		public static Index PRIMARY_KEY_6 = Internal.createIndex("PRIMARY_KEY_6", Loottrackerloot.LOOTTRACKERLOOT, new OrderField[]{Loottrackerloot.LOOTTRACKERLOOT.UNIQUEID}, true);
		public static Index PRIMARY_KEY_2 = Internal.createIndex("PRIMARY_KEY_2", User.USER, new OrderField[]{User.USER.UNIQUEID}, true);
	}
}