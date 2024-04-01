--main
split
-color:#018253•
addSource code
<<=>>
%1$s
%2$s
split
-color:#018253•
try
<<=>>
try {
%1$s
} catch(Throwable e){}
split
-color:#018253•
void name
<<=>>
public void %1$s {
%2$s
}
split
-color:#018253•
if__star__if__ boolean
<<=>>
if(%1$s){
%2$s
} else {
%3$s
}
%4$s
split
-color:#018253•
openUrl url
<<=>>
openUrl("%1$s");
%2$s
split
-color:#018253•
OpenScene scene
<<=>>
openScene("%1$s");
%2$s
split
-color:#018253•
finish
<<=>>
finish();
%1$s
split
-color:#018253•
_DoAfter delay
<<=>>
{
final int timer_id = timers.size();
new StarTimer(new Runnable() {
							@Override
							public void run() {
							try {
							%2$s
							} catch(Exception ex){
							debug("timer error : "+ex.toString());
							}
							}
					},(long)(%1$s),false);
	}
split
-color:#018253•
cancelTimer
<<=>>
timers.get(timer_id).cancel();
%1$s
split
-color:#018253•
_repeatEvery delay
<<=>>
{
final int timer_id = timers.size();
new StarTimer(new Runnable() {
							@Override
							public void run() {
							try {
							%2$s
							} catch(Exception ex){
							timers.get(timer_id).cancel();
							debug("timer error : "+ex.toString());
							}
							}
					},(long)(%1$s),true);
	}
split
-color:#018253•
writeToFile path string
<<=>>
write(%1$s,%2$s);
%3$s
split
--Camera
split
-color:#387095•
setZoom zoom
<<=>>
setZoom((float)(%1$s));
%2$s
split
-color:#387095•
cameraFollow body
<<=>>
setCameraXY(%1$s,true);
%2$s
split
-color:#387095•
setCameraXAt body fixed?
<<=>>
setCameraX(%1$s,%2$s);
%3$s
split
-color:#387095•
setCameraYAt body fixed
<<=>>
setCameraY(%1$s,%2$s);
%3$s
split
-color:#387095•
setCameraXY x y
<<=>>
setCameraXY((float)(%1$s),(float)(%2$s));
%3$s
split
-color:#387095•
setCameraCenter x y
<<=>>
setCameraCenter((float)(%1$s),(float)(%2$s));
%3$s
split
-color:#387095•
setCameraX x
<<=>>
setCameraX((float)(%1$s));
%2$s
split
-color:#387095•
setCameraY y
<<=>>
setCameraY((float)(%1$s));
%2$s
split
-color:#387095•
setCameraOffset offsetX offsetY
<<=>>
setCameraOffset((float)(%1$s),(float)(%2$s));
%3$s
split
--Configurations
split
-color:#88213B•
setsplits splits
<<=>>
setsplits(%1$s);
%2$s
split
-color:#88213B•
ifCollision__star__if__ body1 body2
<<=>>
if(checkCollision(%1$s,%2$s)){
%3$s
} else {
%4$s
}
%5$s
split
-color:#88213B•
Pause
<<=>>
Pause();
%1$s
split
-color:#88213B•
Resume
<<=>>
Resume();
%1$s
saveValue key value
<<=>>
saveValue(%1$s,%2$s);
%3$s
split
-color:#88213B•
setGravity x y
<<=>>
setGravity(%1$s,%2$s);
%3$s
split
--Debug
split
Toast message
<<=>>
toast(%1$s);
%2$s
split
debug message
<<=>>
debug(%1$s);
%2$s
split
--Ui Nodes
split
setVisibility item visibility
<<=>>
%1$s.getView().setVisibility(%2$s);
%3$s
split
setPath video path
<<=>>
//ToDo : Video Element...
//%1$s.asVideo().setVideoPath("%2$s");
%3$s
split
PauseVideo video
<<=>>
//%1$s.asVideo().pause();
%2$s
split
PlayVideo video
<<=>>
//%1$s.asVideo().start();
%2$s
split
setText ui text
<<=>>
%1$s.setItemText(%2$s);
%3$s
split
setAlpha body alpha
<<=>>
%1$s.getView().setAlpha(%2$s);
%3$s
split
setProgress progress value
<<=>>
%1$s.setProgress((int)(%2$s));
%3$s
split
setMax progress max
<<=>>
%1$s.setMax((int)(%2$s));
%3$s
split
--BodyModify
split
-color:#4A7814•
setScaleXY item scaleX scaleY
<<=>>
%1$s.getView().setScaleX((float)(%2$s));
%1$s.getView().setScaleY((float)(%3$s));
%4$s
split
-color:#4A7814•
setScaleX item scaleX
<<=>>
%1$s.getView().setScaleX((float)(%2$s));
%3$s
split
-color:#4A7814•
setScaleY item scaleY
<<=>>
%1$s.getView().setScaleY((float)(%2$s));
%3$s
split
-color:#4A7814•
setTransform body x y angle
<<=>>
%1$s.getBody().setTransform((float)(%2$s),(float)(%3$s),(float)(%4$s));
%5$s
split
-color:#4A7814•
setAnimation body animation
<<=>>
setAnimation(%1$s,"%2$s");
%3$s
split
-color:#4A7814•
setX body x
<<=>>
%1$s.getBody().setTransform((float)(%2$s),%1$s.getBody().getPosition().y,(float)(%1$s.getView().getRotation()));
%3$s
split
-color:#4A7814•
setY body y
<<=>>
%1$s.getBody().setTransform(%1$s.getBody().getPosition().x,(float)(%2$s),(%1$s).getView().getRotation());
%3$s
split
-color:#4A7814•
setAngle body angle
<<=>>
%1$s.getBody().setTransform(%1$s.getBody().getPosition(),(float)(%2$s));
%3$s
split
-color:#4A7814•
setImage body image
<<=>>
setImage(%1$s,"%2$s");
%3$s
split
-color:#4A7814•
copyBody body var
<<=>>
PlayerItem %2$s = %1$s.getClone();
%3$s
split
-color:#4A7814•
destroy body
<<=>>
%1$s.destroy();
%2$s
split
-color:#4A7814•
moveTowardBody body target step
<<=>>
//%1$s.moveTowardBody(%2$s,(float)(%3$s));
%4$s
split
-color:#4A7814•
moveTowardBody body Vector2 step
<<=>>
//%1$s.moveTowardPoint(%2$s,(float)(%3$s));
%4$s
split
--bodyControl
split
-color:#008375•
applyForceToCenter body x y wake
<<=>>
%1$s.getBody().applyForceToCenter((float)(%2$s),(float)(%3$s),%4$s);
%5$s
split
-color:#008375•
applyLinearImpulse body x y pointX pointY wake
<<=>>
%1$s.getBody().applyLinearImpulse((float)(%2$s),(float)(%3$s),(float)(%4$s),(float)(%5$s), %6$s);
%7$s
split
-color:#008375•
applyLinearImpulseToCenter body x y wake
<<=>>
%1$s.getBody().applyLinearImpulse((float)(%2$s),(float)(%3$s),%1$s.getBody().getWorldCenter().x,%1$s.getBody().getWorldCenter().y, %4$s);
%5$s
split
-color:#008375•
applyForce body x y pointX pointY wake
<<=>>
%1$s.getBody().applyForce((float)(%2$s),(float)(%3$s),(float)(%4$s),(float)(%5$s),%6$s);
%7$s
split
-color:#008375•
setAngularVelocity body velocity
<<=>>
%1$s.getBody().setAngularVelocity((float)(%2$s));
%3$s
split
-color:#008375•
applyAngularImpulse body impulse wake
<<=>>
%1$s.getBody().applyAngularImpulse((float)(%2$s),%3$s);
%4$s
split
-color:#008375•
setGravityScale body GravityScale
<<=>>
%1$s.getBody().setGravityScale(%2$s);
%3$s
split
-color:#008375•
setLinearVelocity body xVelocity yVelocity
<<=>>
%1$s.getBody().setLinearVelocity((float)(%2$s),(float)(%3$s));
%4$s
split
-color:#008375•
applyTorque body torque wake
<<=>>
%1$s.getBody().applyTorque((float)(%2$s),%3$s);
%4$s
split
-color:#008375•
setLinearDamping body value
<<=>>
%1$s.getBody().setLinearDamping((float)(%2$s));
%3$s
split
-color:#008375•
--bodyBooleans
split
-color:#008375•
setAwake body wake
<<=>>
%1$s.getBody().setAwake(%2$s);
%3$s
split
-color:#008375•
setBullet body bullet
<<=>>
%1$s.getBody().setBullet(%2$s);
%3$s
split
-color:#008375•
setFixedRotation body fixed
<<=>>
%1$s.getBody().setFixedRotation(%2$s);
%3$s
split
-color:#008375•
setActive body active
<<=>>
%1$s.getBody().setActive(%2$s);
%3$s
split
-color:#008375•
setSleepingAllowed body sleeping
<<=>>
%1$s.getBody().setSleepingAllowed(%2$s);
%3$s
split
--Ui_Animation
split
-color:#008375•
setProperty ui property value
<<=>>
%1$s.getView().animate().%2$s(%3$s);
%4$s
split
-color:#008375•
startAnimation UI
<<=>>
%1$s.getView().animate().start();
%2$s
split
--Sounds
split
-color:#BE9333•
createSound id sound repeat?
<<=>>
createSound("%1$s","%2$s");
loopSound("%1$s",%3$s);
%4$s
split
-color:#BE9333•
playSound SoundID
<<=>>
startSound("%1$s");
%2$s
split
-color:#BE9333•
pauseSound SoundID
<<=>>
pauseSound("%1$s");
%2$s
split
-color:#BE9333•
releaseSound SoundID
<<=>>
releaseSound("%1$s");
%2$s