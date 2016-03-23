package com.beelancrp.daggerproject.mocks;

import com.beelancrp.daggerproject.pojo.ProfileData;

import java.util.ArrayList;

/**
 * Created by bilan on 23.03.2016.
 */
public class MockServiceProfile {
    private static MockServiceProfile ourInstance = new MockServiceProfile();

    public static MockServiceProfile getInstance() {
        return ourInstance;
    }

    private MockServiceProfile() {
    }

    private ArrayList<ProfileData> profilesList;

    public ArrayList<ProfileData> getProfilesList() {
        profilesList = new ArrayList<>();

        for (int i = 0; i < 15; i++){
            ProfileData pd = new ProfileData();
            pd.setName(i+1+"");
            pd.setSurName(i+2+"");
            pd.setBirthday(i+3+"");
            pd.setPosission(i+4+"");
            pd.setFirstWorkDay(i+5+"");
            pd.setTelephone(i+6+"");
            pd.setMemberTelephone(i+7+"");
            pd.setAdress(i+8+"");
            pd.setEmail(i+9+"");
            pd.setFamily(i+10+"");
            pd.setChild(i+11+"");
            pd.setSkype(i+12+"");
            pd.setFopOrNot(i+13+"");
            profilesList.add(pd);
        }
        return profilesList;
    }
}
