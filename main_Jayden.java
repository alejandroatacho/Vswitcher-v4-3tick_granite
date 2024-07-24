WorldPoint wp1 = new WorldPoint(3166, 2908, 0);
WorldPoint wp2 = new WorldPoint(3166, 2909, 0);
WorldPoint wp3 = new WorldPoint(3166, 2910, 0);
WorldPoint wp4 = new WorldPoint(3167, 2910, 0);

int granite = 11387;
int cactus = 1396;
int knife = 946;
int log = 6333;

int knifeS = v.getInventory().slot(knife);
int logS = v.getInventory().slot(log);

GameObject anchor = v.getGameObject().findNearest(cactus);
int anchorX = anchor.getSceneMinLocation().getX();
int anchorY = anchor.getSceneMaxLocation().getY();

if (v.getWalking().nearPosition(wp1, 0)) {
  v.invoke("Mine", "<col=ffff>Granite rocks", granite, 3, anchorX + 4, anchorY + 8, false);
  v.getCallbacks().afterTicks(1, () -> {
    v.invoke("Use", "<col=ff9040>Knife", 0, 25, knifeS, 9764864, false);
    v.invoke("Use", "<col=ffff>Knife</col><col=ffffff> -> <col=ff9040>Teak Logs</col>", 0, 58, logS, 9764864, false);
    v.getInventory().drop(6979, 6981, 6983);
    v.getWalking().walk(wp2);
  });
} else {

  if (v.getWalking().nearPosition(wp2, 0)) {
    v.invoke("Mine", "<col=ffff>Granite rocks", granite, 3, anchorX + 4, anchorY + 9, false);
    v.getCallbacks().afterTicks(1, () -> {
      v.invoke("Use", "<col=ff9040>Knife", 0, 25, knifeS, 9764864, false);
      v.invoke("Use", "<col=ffff>Knife</col><col=ffffff> -> <col=ff9040>Teak Logs</col>", 0, 58, logS, 9764864, false);
      v.getInventory().drop(6979, 6981, 6983);
      v.getWalking().walk(wp3);
    });
  } else {

    if (v.getWalking().nearPosition(wp3, 0)) {
      v.invoke("Mine", "<col=ffff>Granite rocks", granite, 3, anchorX + 4, anchorY + 10, false);
      v.getCallbacks().afterTicks(1, () -> {
        v.invoke("Use", "<col=ff9040>Knife", 0, 25, knifeS, 9764864, false);
        v.invoke("Use", "<col=ffff>Knife</col><col=ffffff> -> <col=ff9040>Teak Logs</col>", 0, 58, logS, 9764864, false);
        v.getInventory().drop(6979, 6981, 6983);
        v.getWalking().walk(wp4);
      });
    } else {
      if (v.getWalking().nearPosition(wp4, 0)) {

        v.invoke("Mine", "<col=ffff>Granite rocks", granite, 3, anchorX + 6, anchorY + 11, false);
        v.getCallbacks().afterTicks(1, () -> {
          v.invoke("Use", "<col=ff9040>Knife", 0, 25, knifeS, 9764864, false);
          v.invoke("Use", "<col=ffff>Knife</col><col=ffffff> -> <col=ff9040>Teak Logs</col>", 0, 58, logS, 9764864, false);
          v.getInventory().drop(6979, 6981, 6983);
          v.getWalking().walk(wp1);
        });

      }
    }
  }
}