package md5451bbb20429142bdf0d77bc7c1203dd7;


public abstract class BaseActivity
	extends android.support.v7.app.AppCompatActivity
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onCreate:(Landroid/os/Bundle;)V:GetOnCreate_Landroid_os_Bundle_Handler\n" +
			"";
		mono.android.Runtime.register ("EGOTaskTretyakov.BaseActivity, EGOTaskTretyakov, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", BaseActivity.class, __md_methods);
	}


	public BaseActivity () throws java.lang.Throwable
	{
		super ();
		if (getClass () == BaseActivity.class)
			mono.android.TypeManager.Activate ("EGOTaskTretyakov.BaseActivity, EGOTaskTretyakov, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public void onCreate (android.os.Bundle p0)
	{
		n_onCreate (p0);
	}

	private native void n_onCreate (android.os.Bundle p0);

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
