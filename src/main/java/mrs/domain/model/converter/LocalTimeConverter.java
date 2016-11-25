package mrs.domain.model.converter;

import java.sql.Time;
import java.time.LocalTime;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter(autoApply = true)
public class LocalTimeConverter implements AttributeConverter<LocalTime, Time> {

	@Override
	public Time convertToDatabaseColumn(LocalTime time) {
		// TODO 自動生成されたメソッド・スタブ
		return time == null ? null : Time.valueOf(time);
	}

	@Override
	public LocalTime convertToEntityAttribute(Time value) {
		// TODO 自動生成されたメソッド・スタブ
		return value == null ? null : value.toLocalTime();
	}
}
