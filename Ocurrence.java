import androidx.annotation.NonNull;

import androidx.annotation.Nullable;

import androidx.room.ColumnInfo;

import androidx.room.Entity;

import androidx.room.PrimaryKey;

@Entity

@Entity(tableName = "ocurrence")

public class Ocurrence{

	@PrimaryKey(autoGenerate = true)

	@NonNull
  
	@ColumnInfo(name = "ocurrenceId")

	private int mId;
  
	@Nullable

	@ColumnInfo(name = "ocurrenceCreationDate")

	private String mCreationDate;

	@Nullable

	@ColumnInfo(description = "ocurrenceDescription")

	private String mDescription; 

	@Nullable

	@ColumnInfo(name = "ocurrenceForwarding")

	private String mForwarding; 
  
	@Nullable

	@ColumnInfo(name = "ocurrenceGrade")

	private int mGrade; 

	public Ocurrence(@Nullable String creationdate, String description, int grade, String forwarding) {

    mCreationDate = creationdate;

    mDescription = description;

    mForwarding = forwarding;
    
    mGrade = grade;
	}


	public int getId() {
		return mId;
	}

	public void setId(int mId) {
		mId = Id;
	}

	public String getCreationDate() {
		return mCreationDate;
	}

	public void setmCreationDate(String CreationDate) {
		mCreationDate = CreationDate;
	}

	public String getDescription() {
		return mDescription;
	}
  
	public void setDescription(String mDescription) {
		mDescription = Description;
	}
  
	public String getForwarding() {
		return mForwarding;
	}
  
	public void setForwarding(String mForwarding) {
		mForwarding = Forwarding;
	}

	public int getGrade() {
		return mGrade;
	}
  
	public void setGrade(int mGrade) {
		mScore = Grade;
	}

  //private int mGrade
  //private int mCreationDate
}
