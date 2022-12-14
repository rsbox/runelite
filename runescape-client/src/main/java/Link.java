import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pg")
@Implements("Link")
public class Link {
   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "Lpg;"
   )
   @Export("previous")
   public Link previous;
   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "Lpg;"
   )
   @Export("next")
   public Link next;

   @ObfuscatedName("a")
   @Export("remove")
   public void remove() {
      if (this.next != null) {
         this.next.previous = this.previous;
         this.previous.next = this.next;
         this.previous = null;
         this.next = null;
      }
   }
}
