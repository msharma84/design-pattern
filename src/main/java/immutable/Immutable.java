package immutable;

import java.util.Objects;

public final class Immutable {
	
	final String value;

	public Immutable(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	@Override
	public boolean equals(Object o) {
		if (!(o instanceof Immutable)) return false;
		Immutable immutable = (Immutable) o;
		return Objects.equals(value, immutable.value);
	}

	/*@Override
	public boolean equals(Object o) {
		if (o == null || getClass() != o.getClass()) return false;
		Immutable immutable = (Immutable) o;
		return Objects.equals(value, immutable.value);
	}*/

	@Override
	public int hashCode() {
		return Objects.hashCode(value);
	}
}


